package com.gmail.morkovnik.maxim;

public interface GroupDAO {

	public void saveGroup(Group group);

	public Group loadGroupByName(String groupName);
}
