
public class Supervisor extends ILeaveRequestHandler {

	@Override
	public void HandleRequest(LeaveRequest request) {
		if (request.getLeaveDays() >= 1 && request.getLeaveDays() < 3)
			System.out.println("Approved by Supervisor");
		else
			nextHandler.HandleRequest(request);
	}

}
