package co.grandcircus;

import java.time.LocalDate;

public class Task {

	private String teamMembersName;
	private String briefDescription;
	private LocalDate dueDate;
	private boolean isCompleted;

	public Task() {
		setTeamMembersName("John Doe");
		setBriefDescription("This task is about ");
		setDueDate(LocalDate.now()); // ("2015-02-20");
		setCompleted(false);

	}
	
	public String toString() {
		String s="";
		s = "Name: "+ teamMembersName + "\n" + "Description: " + briefDescription + "\n" + 
		"Due Date: " + dueDate.toString() + "\n" + "Project Finished: " + isCompleted + "\n";
		return s;
	}

	/**
	 * @return the teamMembersName
	 */
	public String getTeamMembersName() {
		return teamMembersName;
	}

	/**
	 * @param teamMembersName the teamMembersName to set
	 */
	public void setTeamMembersName(String teamMembersName) {
		this.teamMembersName = teamMembersName;
	}

	/**
	 * @return the briefDescription
	 */
	public String getBriefDescription() {
		return briefDescription;
	}

	/**
	 * @param briefDescription the briefDescription to set
	 */
	public void setBriefDescription(String briefDescription) {
		this.briefDescription = briefDescription;
	}

	/**
	 * @return the dueDate
	 */
	public LocalDate getDueDate() {
		return dueDate;
	}

	/**
	 * @param dueDate the dueDate to set
	 */
	public void setDueDate(LocalDate dueDate) {
		this.dueDate = dueDate;
	}

	/**
	 * @return the isCompleted
	 */
	public boolean isCompleted() {
		return isCompleted;
	}

	/**
	 * @param isCompleted the isCompleted to set
	 */
	public void setCompleted(boolean isCompleted) {
		this.isCompleted = isCompleted;
	}
	
	
	
}
