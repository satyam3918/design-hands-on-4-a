
public abstract class ILeaveRequestHandler {

	ILeaveRequestHandler nextHandler;

	abstract void HandleRequest(LeaveRequest request);
}
