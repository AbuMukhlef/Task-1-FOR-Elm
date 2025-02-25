package presentation.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.ObjectMapper;

import presentation.model.EmployeeModel;

@WebServlet("/api/v1/employees/*")
public class EmployeeController extends HttpServlet {

	private static final long serialVersionUID = 1L;

	private Map<Integer, EmployeeModel> employeeMap = new HashMap<Integer, EmployeeModel>();
	private ObjectMapper employeeMapper = new ObjectMapper();

	@Override
	public void init() throws ServletException {
		employeeMap.put(1, new EmployeeModel(1, "Abdullah", "M", "16/11/1989", "0544948800",
				Arrays.asList("Programming", "FIFA")));
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try (PrintWriter out = resp.getWriter()) {
			resp.setContentType("application/json");
			String empID = req.getPathInfo();
			if (empID != null && empID.length() > 1) {
				String urlNumber = empID.substring(1);
				int empId = Integer.parseInt(urlNumber);
				EmployeeModel emp = employeeMap.get(empId);

				if (emp != null) {
					out.write(employeeMapper.writeValueAsString(emp));
				} else {

					resp.setStatus(HttpServletResponse.SC_NOT_FOUND);
					out.write("Employee not found");
				}

			} else {
				out.write(employeeMapper.writeValueAsString(employeeMap.values()));

			}
		} catch (Exception e) {
			resp.getWriter().println("Invaled Input");
		}
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try (PrintWriter out = resp.getWriter()) {
			BufferedReader read = req.getReader();
			StringBuilder text = new StringBuilder();
			String line;

			while ((line = read.readLine()) != null) {
				text.append(line);
			}

			EmployeeModel newEmp = employeeMapper.readValue(text.toString(), EmployeeModel.class);
			employeeMap.put(newEmp.getId(), newEmp);
			out.write(employeeMapper.writeValueAsString(newEmp));
			resp.setStatus(HttpServletResponse.SC_OK);
			read.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try (PrintWriter out = resp.getWriter()) {
			BufferedReader read = req.getReader();
			StringBuilder text = new StringBuilder();
			String line;

			while ((line = read.readLine()) != null) {
				text.append(line);
			}

			EmployeeModel upEmp = employeeMapper.readValue(text.toString(), EmployeeModel.class);
			if (employeeMap.containsKey(upEmp.getId())) {
				employeeMap.put(upEmp.getId(), upEmp);
				out.write(employeeMapper.writeValueAsString(upEmp));
				resp.setStatus(HttpServletResponse.SC_OK);
			} else {
				resp.setStatus(HttpServletResponse.SC_NOT_FOUND);
				out.write("Employee not found");

			}

			read.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Override
	protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try (PrintWriter out = resp.getWriter()) {
			resp.setContentType("application/json");
			String empID = req.getPathInfo();
			if (empID != null && empID.length() > 1) {
				String urlNumber = empID.substring(1);
				int empId = Integer.parseInt(urlNumber);
				EmployeeModel emp = employeeMap.get(empId);

				if (emp != null) {
					employeeMap.remove(emp.getId());
					resp.setStatus(HttpServletResponse.SC_OK);
					out.write("Employee was removed!");
				} else {

					resp.setStatus(HttpServletResponse.SC_NOT_FOUND);
					out.write("Employee not found");
				}

			} else {

				resp.getWriter().println("Invaled Input");
			}
		} catch (Exception e) {
		}
	}

}
