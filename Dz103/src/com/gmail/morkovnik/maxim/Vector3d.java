package com.gmail.morkovnik.maxim;

public class Vector3d {
	private double x;
	private double y;
	private double z;

	public Vector3d() {
		super();
	}

	public Vector3d(double x, double y, double z) {
		super();
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public double getZ() {
		return z;
	}

	public void setZ(double z) {
		this.z = z;
	}

	public Vector3d addVec(Vector3d v2) {
		Vector3d vRes = new Vector3d(this.x + v2.x, this.y + v2.y, this.z + v2.z);
		return vRes;
	}

	public double scalarPro(Vector3d v2) {
		return this.x * v2.x + this.y * v2.y + this.z * v2.z;
	}

	public Vector3d vecPro(Vector3d v2) {
		Vector3d vRes = new Vector3d(this.y * v2.z - this.z * v2.y, this.z * v2.x - this.x * v2.z,
				this.x * v2.y - this.y * v2.x);
		return vRes;
	}

	@Override
	public String toString() {
		return "Vector3d [x=" + x + ", y=" + y + ", z=" + z + "]";
	}
}
