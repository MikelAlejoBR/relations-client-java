// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: rebac/v1/relationships.proto

package api.relations.v1;

public interface ReadRelationshipsRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.rebac.v1.ReadRelationshipsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.api.rebac.v1.RelationshipFilter filter = 1;</code>
   * @return Whether the filter field is set.
   */
  boolean hasFilter();
  /**
   * <code>.api.rebac.v1.RelationshipFilter filter = 1;</code>
   * @return The filter.
   */
  api.relations.v1.RelationshipFilter getFilter();
  /**
   * <code>.api.rebac.v1.RelationshipFilter filter = 1;</code>
   */
  api.relations.v1.RelationshipFilterOrBuilder getFilterOrBuilder();
}