/*
 * Copyright Plajdo, 2018
 * Source code taken with permission from https://github.com/ShardBytes/ALightInTheJava/blob/master/core/src/io/github/shardbytes/alightinthevoid/internal/Tween.java
 */

/**
 * Value interpolation class.
 */
public class Tween{

	private double variable;
	private double target;
	private double changeRate;

	private boolean stopOnReached;
	private boolean active;

	/**
	 * Constructs new interpolated number wrapper.
	 * @param value Initial value
	 * @param changeRate Rate at which the value should change
	 * @param active Determines if this object is active or not
	 * @param stopOnReached Determines if this object should remain active after the target value is reached
	 */
	public Tween(double value, double changeRate, boolean active, boolean stopOnReached){
		this.variable = value;
		this.target = value;
		this.changeRate = changeRate;
		this.stopOnReached = stopOnReached;
		this.active = active;
	}

	/**
	 * Sets target value for this object.
	 * @param value Target value
	 */
	public void setTarget(double value){
		this.target = value;
	}

	/**
	 * Sets defined value immediately without slowly interpolating to it.
	 * @param value Defined value
	 */
	public void setValue(double value){
		this.target = value;
		this.variable = value;
	}

	/**
	 * Returns current interpolated value as double.
	 * @return Interpolated value
	 */
	public double getDouble(){
		return variable;
	}

	/**
	 * Returns current interpolated value as float.
	 * @return Interpolated value
	 */
	public float getFloat(){
		return (float)variable;
	}

	/**
	 * Returns current interpolated value as int.
	 * @return Interpolated value
	 */
	public int getInt(){
		return (int)Math.round(variable);
	}

	/**
	 * Returns current interpolated value as long.
	 * @return Interpolated value
	 */
	public long getLong(){
		return Math.round(variable);
	}

	/**
	 * Sets if this object is active and if its value should be interpolated.
	 * @param active Should be active?
	 */
	public void setActive(boolean active){
		this.active = active;
	}

	/**
	 * Step the interpolation process by one step. This should be called every frame before
	 * rendering (during input detection phase, ...).
	 * @param delta Render time difference
	 */
	public void step(float delta){
		if(active){
			double d = changeRate * delta;

			if(variable > target - d && variable < target + d){
				variable = target;

				if(stopOnReached){
					setActive(false);
				}

			}

			if(variable < target){
				variable += d;
			}else if(variable > target){
				variable -= d;
			}

		}

	}

}
