// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: rebac/v1/relationships.proto

package api.relations.v1;

public interface RelationshipOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.rebac.v1.Relationship)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.api.rebac.v1.ObjectReference object = 1;</code>
   * @return Whether the object field is set.
   */
  boolean hasObject();
  /**
   * <code>.api.rebac.v1.ObjectReference object = 1;</code>
   * @return The object.
   */
  api.relations.v1.ObjectReference getObject();
  /**
   * <code>.api.rebac.v1.ObjectReference object = 1;</code>
   */
  api.relations.v1.ObjectReferenceOrBuilder getObjectOrBuilder();

  /**
   * <code>string relation = 2;</code>
   * @return The relation.
   */
  java.lang.String getRelation();
  /**
   * <code>string relation = 2;</code>
   * @return The bytes for relation.
   */
  com.google.protobuf.ByteString
      getRelationBytes();

  /**
   * <code>.api.rebac.v1.SubjectReference subject = 3;</code>
   * @return Whether the subject field is set.
   */
  boolean hasSubject();
  /**
   * <code>.api.rebac.v1.SubjectReference subject = 3;</code>
   * @return The subject.
   */
  api.relations.v1.SubjectReference getSubject();
  /**
   * <code>.api.rebac.v1.SubjectReference subject = 3;</code>
   */
  api.relations.v1.SubjectReferenceOrBuilder getSubjectOrBuilder();
}
