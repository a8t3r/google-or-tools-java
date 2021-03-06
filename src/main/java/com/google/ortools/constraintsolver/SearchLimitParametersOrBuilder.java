// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ortools/constraint_solver/search_limit.proto

package com.google.ortools.constraintsolver;

public interface SearchLimitParametersOrBuilder extends
    // @@protoc_insertion_point(interface_extends:operations_research.SearchLimitParameters)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int64 time = 1;</code>
   */
  long getTime();

  /**
   * <code>int64 branches = 2;</code>
   */
  long getBranches();

  /**
   * <code>int64 failures = 3;</code>
   */
  long getFailures();

  /**
   * <code>int64 solutions = 4;</code>
   */
  long getSolutions();

  /**
   * <code>bool smart_time_check = 5;</code>
   */
  boolean getSmartTimeCheck();

  /**
   * <code>bool cumulative = 6;</code>
   */
  boolean getCumulative();
}
