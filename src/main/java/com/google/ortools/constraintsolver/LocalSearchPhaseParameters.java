/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.10
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.google.ortools.constraintsolver;

public class LocalSearchPhaseParameters {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected LocalSearchPhaseParameters(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(LocalSearchPhaseParameters obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        operations_research_constraint_solverJNI.delete_LocalSearchPhaseParameters(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public LocalSearchPhaseParameters() {
    this(operations_research_constraint_solverJNI.new_LocalSearchPhaseParameters(), true);
  }

}
