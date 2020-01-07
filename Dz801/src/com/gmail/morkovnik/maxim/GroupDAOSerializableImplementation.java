package com.gmail.morkovnik.maxim;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class GroupDAOSerializableImplementation implements GroupDAO {

	private File casheFolder;

	public GroupDAOSerializableImplementation(File casheFolder) {
		super();
		this.casheFolder = casheFolder;
	}

	public GroupDAOSerializableImplementation() {
		super();
	}

	@Override
	public void saveGroup(Group group) {
		File file = new File(casheFolder, group.getGroupName() + ".pn");
		try (ObjectOutput oos = new ObjectOutputStream(new FileOutputStream(file))) {
			oos.writeObject(group);
		} catch (IOException e) {
		}
	}

	@Override
	public Group loadGroupByName(String groupName) {
		File file = new File(casheFolder, groupName + ".pn");
		try (ObjectInput ois = new ObjectInputStream(new FileInputStream(file))) {
			return (Group) ois.readObject();
		} catch (IOException | ClassNotFoundException e) {
			return null;
		}
	}
}
