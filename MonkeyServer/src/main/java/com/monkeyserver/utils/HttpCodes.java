package com.monkeyserver.utils;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class HttpCodes {

    protected LinkedHashMap<Integer, String> statusList = new LinkedHashMap<Integer, String>();

    public HttpCodes(){
        statusList.put(100,"Continue");
        statusList.put(101,"Switching Protocols");
        statusList.put(102,"Processing");
        statusList.put(103,"Unassigned");
        statusList.put(199,"Unassigned");
        statusList.put(200,"OK");
        statusList.put(201,"Created");
        statusList.put(202,"Accepted");
        statusList.put(203,"Non-Authoritative Information");
        statusList.put(204,"No Content");
        statusList.put(205,"Reset Content");
        statusList.put(206,"Partial Content");
        statusList.put(207,"Multi-Status");
        statusList.put(208,"Already Reported");
        statusList.put(209,"Unassigned");
        statusList.put(225,"Unassigned");
        statusList.put(226,"IM Used");
        statusList.put(227,"Unassigned");
        statusList.put(299,"Unassigned");
        statusList.put(300,"Multiple Choices");
        statusList.put(301,"Moved Permanently");
        statusList.put(302,"Found");
        statusList.put(303,"See Other");
        statusList.put(304,"Not Modified");
        statusList.put(305,"Use Proxy");
        statusList.put(306,"(Unused)");
        statusList.put(307,"Temporary Redirect");
        statusList.put(308,"Permanent Redirect");
        statusList.put(309,"Unassigned");
        statusList.put(399,"Unassigned");
        statusList.put(400,"Bad Request");
        statusList.put(401,"Unauthorized");
        statusList.put(402,"Payment Required");
        statusList.put(403,"Forbidden");
        statusList.put(404,"Not Found");
        statusList.put(405,"Method Not Allowed");
        statusList.put(406,"Not Acceptable");
        statusList.put(407,"Proxy Authentication Required");
        statusList.put(408,"Request Timeout");
        statusList.put(409,"Conflict");
        statusList.put(410,"Gone");
        statusList.put(411,"Length Required");
        statusList.put(412,"Precondition Failed");
        statusList.put(413,"Payload Too Large");
        statusList.put(414,"URI Too Long");
        statusList.put(415,"Unsupported Media Type");
        statusList.put(416,"Range Not Satisfiable");
        statusList.put(417,"Expectation Failed");
        statusList.put(418,"Unassigned");
        statusList.put(420,"Unassigned");
        statusList.put(421,"Misdirected Request");
        statusList.put(422,"Unprocessable Entity");
        statusList.put(423,"Locked");
        statusList.put(424,"Failed Dependency");
        statusList.put(425,"Unassigned");
        statusList.put(426,"Upgrade Required");
        statusList.put(427,"Unassigned");
        statusList.put(428,"Precondition Required");
        statusList.put(429,"Too Many Requests");
        statusList.put(430,"Unassigned");
        statusList.put(431,"Request Header Fields Too Large");
        statusList.put(432,"Unassigned");
        statusList.put(499,"Unassigned");
        statusList.put(500,"Internal Server Error");
        statusList.put(501,"Not Implemented");
        statusList.put(502,"Bad Gateway");
        statusList.put(503,"Service Unavailable");
        statusList.put(504,"Gateway Timeout");
        statusList.put(505,"HTTP Version Not Supported");
        statusList.put(506,"Variant Also Negotiates");
        statusList.put(507,"Insufficient Storage");
        statusList.put(508,"Loop Detected");
        statusList.put(509,"Unassigned");
        statusList.put(510,"Not Extended");
        statusList.put(511,"Network Authentication Required");
        statusList.put(512,"Unassigned");
        statusList.put(599,"Unassigned");
    }

    public HashMap getStatusList() {
        return statusList;
    }
}
