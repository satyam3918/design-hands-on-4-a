
public class ProjectManager extends ILeaveRequestHandler {

	@Override
	public void HandleRequest(LeaveRequest request) {
		if (request.getLeaveDays() >= 3 && request.getLeaveDays() < 5)
			System.out.println("Approved by Project Manager");
		else
			nextHandler.HandleRequest(request);

	}

}
