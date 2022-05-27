package com.chainsys.webapp.first;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.chainsys.miniproject.commonutil.InvalidInputDataException;
import com.chainsys.miniproject.commonutil.Validator;
import com.chainsys.miniproject.dao.AppointmentDao;
import com.chainsys.miniproject.dao.DoctorDao;
import com.chainsys.miniproject.dao.EmployeeDao;
import com.chainsys.miniproject.pojo.Appointment;
import com.chainsys.miniproject.pojo.Employee;

/**
 * Servlet implementation class Appointments
 */
public class Appointments extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Appointments() {
		super();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
		{
			response.getWriter().append("Served at: ").append(request.getContextPath());
			PrintWriter out = response.getWriter();
			List<Appointment> apolist = AppointmentDao.getAllAppointment();
			Iterator<Appointment> apoItr = apolist.iterator();
			while (apoItr.hasNext()) {
				Appointment apo = apoItr.next();
				out.println("</hr>");
				out.println("Apo id:" + apo.getApp_Id() + "Apo Date:" + apo.getApp_date() + "Doc id:" + apo.getDoc_id()
						+ "Patient Name" + apo.getPatient_name() + "fees collected" + apo.getFees_collected()
						+ "fees nature" + apo.getFees_nature());
			}
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		Appointment newapo = null;
		if (request.getParameter("click").equals("ADDAPO")) {
			int result = 0;
			int apo_Id = 0;
			try {
				newapo = new Appointment();
				String id = request.getParameter("id");
				try {
					Validator.checkStringForParseInt(id);
				} catch (InvalidInputDataException err) {
					err.printStackTrace();
				}
				apo_Id = Integer.parseInt(id);
				try {
					Validator.CheckNumberForGreaterThanZero(apo_Id);
				} catch (InvalidInputDataException err) {
					err.printStackTrace();
				}
				newapo.setApp_Id(apo_Id);
				// -------------
				SimpleDateFormat apo_dateFormate = new SimpleDateFormat("dd/MM/yyyy");
				String apo_Date = request.getParameter("appdate");
				// Date hire_date=hire_dateFormate.parse(emp_HireDate);

				Date newDate = null;
				try {
					newDate = apo_dateFormate.parse(apo_Date);
				} catch (ParseException e) {
					e.printStackTrace();
				}

				newapo.setApp_date(newDate);
				// -------------------------
				int doc_id = 0;
				try {
					String Id = request.getParameter("docid");
					try {
						Validator.checkStringForParseInt(Id);
					} catch (InvalidInputDataException err) {
						err.printStackTrace();
					}
					doc_id = Integer.parseInt(Id);
					try {
						Validator.CheckNumberForGreaterThanZero(doc_id);
					} catch (InvalidInputDataException err) {
						err.printStackTrace();
					}
					newapo.setDoc_id(doc_id);
				} catch (Exception e) {
					e.printStackTrace();
				}
				// ----------------------
				String pname = request.getParameter("pname");
				try {
					Validator.checkStringOnly(pname);
				} catch (InvalidInputDataException e) {
					e.printStackTrace();
					return;
				}
				try {
					Validator.checklengthOfString(pname);
				} catch (InvalidInputDataException err) {
					err.printStackTrace();
				}
				newapo.setPatient_name(pname);
				// ---------------------
				String fees = request.getParameter("fees_collected");
				try {
					Validator.checkStringForParseInt(fees);
				} catch (InvalidInputDataException err) {
					err.printStackTrace();
				}
				float salParse = Float.parseFloat(fees);
				try {
					Validator.CheckNumberForGreaterThanZero(salParse);
				} catch (InvalidInputDataException err) {
					err.printStackTrace();
				}
				newapo.setFees_collected(salParse);
				// -----------------------
				String fees_nature = request.getParameter("fees_nature");
				try {
					Validator.checkStringOnly(fees_nature);
				} catch (InvalidInputDataException e) {
					e.printStackTrace();
					return;
				}
				try {
					Validator.checklengthOfString(fees_nature);
				} catch (InvalidInputDataException err) {
					err.printStackTrace();
				}
				newapo.setFees_nature(fees_nature);
				// ----------------------
				result = AppointmentDao.insertAppointment(newapo);
				out.println(result + " row inserted");
			} catch (Exception e) {
				e.printStackTrace();
			}

		} else if (request.getParameter("click").equals("UPDATEAPP")) {
			doPut(request,response);
		} else if (request.getParameter("click").equals("DELETEAPP")) {
			doDelete(request,response);
		}
	}

	/**
	 * @see HttpServlet#doPut(HttpServletRequest, HttpServletResponse)
	 */
	protected void doPut(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		Appointment apo = null;
		int result = 0;
		int apo_ID = 0;
		try {
			apo = new Appointment();
			String id = request.getParameter("id");
			try {
				Validator.checkStringForParseInt(id);
			} catch (InvalidInputDataException err) {
				err.printStackTrace();
			}
			apo_ID = Integer.parseInt(id);
			try {
				Validator.CheckNumberForGreaterThanZero(apo_ID);
			} catch (InvalidInputDataException err) {
				err.printStackTrace();
			}
			apo.setApp_Id(apo_ID);
			// --------------------
			SimpleDateFormat apo_dateFormate = new SimpleDateFormat("dd/MM/yyyy");
			String apo_Date = request.getParameter("appdate");
			Date newDate = null;
			try {
				newDate = apo_dateFormate.parse(apo_Date);
			} catch (ParseException e) {
				e.printStackTrace();
			}

			apo.setApp_date(newDate);
			// -------------------------
			int doc_id = 0;
			try {
				String Id = request.getParameter("docid");
				try {
					Validator.checkStringForParseInt(Id);
				} catch (InvalidInputDataException err) {
					err.printStackTrace();
				}
				doc_id = Integer.parseInt(Id);
				try {
					Validator.CheckNumberForGreaterThanZero(doc_id);
				} catch (InvalidInputDataException err) {
					err.printStackTrace();
				}
				apo.setDoc_id(doc_id);
			} catch (Exception e) {
				e.printStackTrace();
			}
			// ----------------------
			String pname = request.getParameter("pname");
			try {
				Validator.checkStringOnly(pname);
			} catch (InvalidInputDataException e) {
				e.printStackTrace();
				return;
			}
			try {
				Validator.checklengthOfString(pname);
			} catch (InvalidInputDataException err) {
				err.printStackTrace();
			}
			apo.setPatient_name(pname);
			// ---------------------
			String fees = request.getParameter("fees_collected");
			try {
				Validator.checkStringForParseInt(fees);
			} catch (InvalidInputDataException err) {
				err.printStackTrace();
			}
			float salParse = Float.parseFloat(fees);
			try {
				Validator.CheckNumberForGreaterThanZero(salParse);
			} catch (InvalidInputDataException err) {
				err.printStackTrace();
			}
			apo.setFees_collected(salParse);
			// -----------------------
			String fees_nature = request.getParameter("fees_nature");
			try {
				Validator.checkStringOnly(fees_nature);
			} catch (InvalidInputDataException e) {
				e.printStackTrace();
				return;
			}
			try {
				Validator.checklengthOfString(fees_nature);
			} catch (InvalidInputDataException err) {
				err.printStackTrace();
			}
			apo.setFees_nature(fees_nature);
			// ----------------------
			result = AppointmentDao.updateAppointment(apo);
			out.println(result+" row updated");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doDelete(HttpServletRequest, HttpServletResponse)
	 */
	protected void doDelete(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		String id = null;
		try {
			id = request.getParameter("id");
			Validator.checkStringForParseInt(id);
		} catch (InvalidInputDataException e) {
			e.printStackTrace();
		}
		int apo_Id = Integer.parseInt(id);
		try {
			Validator.CheckNumberForGreaterThanZero(apo_Id);
		} catch (InvalidInputDataException e) {
			e.printStackTrace();
			System.exit(-1);
		}
		int result = AppointmentDao.deleteAppointment(apo_Id);
		out.println(result + "row deleted");
	}
}
