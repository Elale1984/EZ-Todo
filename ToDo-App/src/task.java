
public class task {
	
	public String taskName;
	public String taskTime;
	public String meridian;
	public String taskDate;
	/**
	 * @return the taskName
	 */
	public String getTaskName() {
		return taskName;
	}
	/**
	 * @param taskName the taskName to set
	 */
	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}
	/**
	 * @return the taskTime
	 */
	public String getTaskTime() {
		return taskTime;
	}
	/**
	 * @param taskTime the taskTime to set
	 */
	public void setTaskTime(String taskTime) {
		this.taskTime = taskTime;
	}
	/**
	 * @return the meridian
	 */
	public String getMeridian() {
		return meridian;
	}
	/**
	 * @param meridian the meridian to set
	 */
	public void setMeridian(String meridian) {
		this.meridian = meridian;
	}
	/**
	 * @return the taskDate
	 */
	public String getTaskDate() {
		return taskDate; 
	}
	/**
	 * @param taskDate the taskDate to set
	 */
	public void setTaskDate(String taskDate) {
		this.taskDate = taskDate;
	}
	
	// The task object constructor
	task(String taskName, String taskTime, String meridian, String taskDate){
		this.taskName = taskName;
		this.taskTime = taskTime;
		this.meridian = meridian;
		this.taskDate = taskDate;
		
	}

}
