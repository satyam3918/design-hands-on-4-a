
public class HR extends ILeaveRequestHandler {
	
	@Override
	public void HandleRequest(LeaveRequest request) {
		if (request.getLeaveDays() > 5)
			System.out.println("Approved by HR");
		else
			nextHandler.HandleRequest(request);
	}

}
