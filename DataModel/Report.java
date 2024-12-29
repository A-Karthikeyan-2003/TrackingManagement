package DataModel;

import TrackingManagementSystem.Status;

public class Report {

	int reportId; String reportDefinition, sendBy  , replyFromAdmin , sendDate , replyDate, reportTitle ;


	int onTransactionId;

	public String getReportTitle() {
		return reportTitle;
	}


	Status status = Status.PENDING;



	public Report(int reportId, String reportTitle, String reportDefinition, int onTransactionId,String sendBy ,String sendDate , Status status ) {
	
		this.reportId = reportId;
		this.reportTitle = reportTitle;
		this.reportDefinition = reportDefinition;
		this.onTransactionId = onTransactionId;
		this.sendBy = sendBy;
		this.sendDate = sendDate;
		this.status = status;
	}




	public void setStatus(Status status) {
		this.status = status;
	}




	public String getReplyFromAdmin() {
		return replyFromAdmin;
	}




	public void setReplyFromAdmin(String replyFromAdmin) {
		this.replyFromAdmin = replyFromAdmin;
	}




	public String getReplyDate() {
		return replyDate;
	}




	public void setReplyDate(String replyDate) {
		this.replyDate = replyDate;
	}




	public int getReportId() {
		return reportId;
	}




	public String getReportDefinition() {
		return reportDefinition;
	}




	public String getSendBy() {
		return sendBy;
	}




	public int getOnTransactionId() {
		return onTransactionId;
	}




	public String getSendDate() {
		return sendDate;
	}






	@Override
	public String toString() {
		return "\nReportId = " + reportId + "\nReportDefinition = " + reportDefinition + "\nSendBy = " + sendBy
				+ "\nReplyFromAdmin = " + replyFromAdmin + "\nSendDate = " + sendDate + "\nReplyDate = " + replyDate
				+ "\nReportTitle = " + reportTitle + "\nOnTransactionId = " + onTransactionId + "";
	}
	
	
	
	
}
