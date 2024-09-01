// package: analytics
// file: analytics.proto

import * as jspb from "google-protobuf";

export class AnalyticsEvent extends jspb.Message {
  getEventType(): string;
  setEventType(value: string): void;

  getUserId(): string;
  setUserId(value: string): void;

  getTimestamp(): string;
  setTimestamp(value: string): void;

  getAttributesMap(): jspb.Map<string, string>;
  clearAttributesMap(): void;
  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): AnalyticsEvent.AsObject;
  static toObject(includeInstance: boolean, msg: AnalyticsEvent): AnalyticsEvent.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: AnalyticsEvent, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): AnalyticsEvent;
  static deserializeBinaryFromReader(message: AnalyticsEvent, reader: jspb.BinaryReader): AnalyticsEvent;
}

export namespace AnalyticsEvent {
  export type AsObject = {
    eventType: string,
    userId: string,
    timestamp: string,
    attributesMap: Array<[string, string]>,
  }
}

