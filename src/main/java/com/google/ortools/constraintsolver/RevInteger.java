/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.10
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.google.ortools.constraintsolver;

public class RevInteger {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected RevInteger(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(RevInteger obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        operations_research_constraint_solverJNI.delete_RevInteger(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public RevInteger(int val) {
    this(operations_research_constraint_solverJNI.new_RevInteger(val), true);
  }

  public int value() {
    return operations_research_constraint_solverJNI.RevInteger_value(swigCPtr, this);
  }

  public void setValue(Solver s, int val) {
    operations_research_constraint_solverJNI.RevInteger_setValue(swigCPtr, this, Solver.getCPtr(s), s, val);
  }

}
