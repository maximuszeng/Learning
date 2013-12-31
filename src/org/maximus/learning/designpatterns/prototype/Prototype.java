package org.maximus.learning.designpatterns.prototype;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Prototype implements Cloneable, Serializable {

	private static final long serialVersionUID = 1;
	private String string;

	private SerializableObject obj;

	/* ????????? */
	public Object clone() throws CloneNotSupportedException {
		/* super.clone()????????????Object???clone()???????????????Object?????????clone()???native??? */
		Prototype prototype = (Prototype) super.clone();
		return prototype;
	}

	/* ????????? */
	public Object deepClone() throws IOException, ClassNotFoundException {

		/* ????????????????????????????????? */
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		ObjectOutputStream oos = new ObjectOutputStream(bos);
		oos.writeObject(this);

		/* ???????????????????????????????????? */
		ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
		ObjectInputStream ois = new ObjectInputStream(bis);
		return ois.readObject();
	}

	public String getString() {
		return string;
	}

	public void setString(String string) {
		this.string = string;
	}

	public SerializableObject getObj() {
		return obj;
	}

	public void setObj(SerializableObject obj) {
		this.obj = obj;
	}
}

class SerializableObject implements Serializable {
	private static final long serialVersionUID = 1;
}