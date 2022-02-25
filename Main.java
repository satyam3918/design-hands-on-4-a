
public class Main {

	public static void main(String[] args) {
		LeaveRequest leaveRequest = new LeaveRequest();
		leaveRequest.setEmployee("Saptak");
		leaveRequest.setLeaveDays(15);
		ILeaveRequestHandler supervisor = new Supervisor();
		ILeaveRequestHandler manager = new ProjectManager();
		ILeaveRequestHandler hr = new HR();
		supervisor.nextHandler = manager;
		manager.nextHandler = hr;
		supervisor.HandleRequest(leaveRequest);

	}

}
