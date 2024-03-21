package com.ms.brand_influencer.model.api;

import com.ms.brand_influencer.commons.ErrorResponse;
import com.ms.brand_influencer.commons.SuccessResponse;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class ResponseCodes {


        public static final int SUCCESS = 2000;
        public static final int UNKNOWN = 9000;
        public static final int PARAMETERS_MISSING = 9001;

        public static final int INVALID_CLIENT_PLATFORM = 4000;
        public static final int BAD_JSON = 4001;
        public static final int INVALID_USER_ID = 4002;
        public static final int INVALID_EMAIL = 4003;
        public static final int ALREADY_REGISTERED = 4004;
        public static final int HANDLE_NOT_AVAILABLE = 4006;
        public static final int FILE_NOT_FOUND = 4007;
        public static final int INVALID_USER_REFERRAL_CODE = 4008;
        public static final int INVALID_USER_ROLE = 4009;
        public static final int NEED_RE_AUTH = 4010;
        public static final int REFERRAL_CODE_ALREADY_APPLIED = 4011;

        public static final int FORGOT_PASSWORD_USING_SEQ_QTN = 4101;


        public static final int FILE_UPLOAD_ERROR = 5001;
        public static final int INVALID_CODE = 5002;
        public static final int ALREADY_USED = 5003;
        public static final int INTERNAL_ERROR = 5004;
        public static final int INVALID_STATUS_CODE = 5005;
        public static final int EMAIL_ALREADY_VERIFIED = 5006;
        public static final int MOBILE_ALREADY_VERIFIED = 5007;
        public static final int INVALID_ACCESS_TOKEN = 5008;
        public static final int INVALID_SOCIAL_PROVIDER = 5009;
        public static final int NO_ADD_FOUND = 5010;
        public static final int EMPTY_VERIFICATION_CODE = 5011;
        public static final int EXPIRE_VERIFICATION_CODE = 5012;
        public static final int EMPTY_PASSWORD = 5013;
        public static final int INVALID_OTP = 5014;
        public static final int OTP_EXPIRED = 5015;
        public static final int OLD_PASSWORD_INCORRECT = 5016;




        private static final Map<Integer, String> responseCodeMap;

        static {
        responseCodeMap = new HashMap<>();
        responseCodeMap.put(SUCCESS, "Success");
        responseCodeMap.put(INVALID_CLIENT_PLATFORM, "Invalid clientPlatform");
        responseCodeMap.put(BAD_JSON, "Bad Json");
        responseCodeMap.put(INVALID_USER_ID, "Invalid userId");
        responseCodeMap.put(INVALID_USER_ROLE, "Invalid user role");
        responseCodeMap.put(INVALID_EMAIL, "Invalid Email");
        responseCodeMap.put(ALREADY_REGISTERED, "Already registered. Try login");
        responseCodeMap.put(HANDLE_NOT_AVAILABLE, "Handle not available");
        responseCodeMap.put(FILE_NOT_FOUND, "File not found");
        responseCodeMap.put(INVALID_USER_REFERRAL_CODE, "Invalid referal code");
        responseCodeMap.put(NEED_RE_AUTH, "Need re-auth");
        responseCodeMap.put(REFERRAL_CODE_ALREADY_APPLIED, "Referal code already applied");


        responseCodeMap.put(FORGOT_PASSWORD_USING_SEQ_QTN, "Forgot password require sequrity question verification");

        responseCodeMap.put(UNKNOWN, "Unknown");
        responseCodeMap.put(PARAMETERS_MISSING, "Parameters Missing");
        responseCodeMap.put(FILE_UPLOAD_ERROR, "Failed to upload file");
        responseCodeMap.put(INVALID_CODE, "Code is invalid");
        responseCodeMap.put(ALREADY_USED, "Code is already used");
        responseCodeMap.put(INTERNAL_ERROR, "Sorry! some internal problem please try after some time");
        responseCodeMap.put(INVALID_STATUS_CODE, "Sorry! your status code is invalid");
        responseCodeMap.put(EMAIL_ALREADY_VERIFIED, "Sorry! Your Email Is Already Verified");
        responseCodeMap.put(MOBILE_ALREADY_VERIFIED, "Sorry! Your Mobile Is Already Verified");
        responseCodeMap.put(INVALID_ACCESS_TOKEN, "Invalid Access Token");
        responseCodeMap.put(INVALID_SOCIAL_PROVIDER, "Invalid Social Provider");
        responseCodeMap.put(NO_ADD_FOUND, "Sorry No Add Found");
        responseCodeMap.put(EMPTY_VERIFICATION_CODE, "Please Enter Verification Code");
        responseCodeMap.put(EXPIRE_VERIFICATION_CODE, "Verification Code Is Expired");
        responseCodeMap.put(EMPTY_PASSWORD, "Please Enter Password");
        responseCodeMap.put(INVALID_OTP, "Invalid OTP");
        responseCodeMap.put(OTP_EXPIRED, "OTP is expired");
        responseCodeMap.put(OLD_PASSWORD_INCORRECT, "Incorrect old password");


    }

        public static String getDescription(int code) {
        return responseCodeMap.get(code);
    }

        public static SuccessResponse getSuccessResponse() {
        return SuccessResponse.builder().code(SUCCESS).message(getDescription(SUCCESS)).build();
    }

        public static SuccessResponse getSuccessResponse(int code) {
        return SuccessResponse.builder().code(code).message(getDescription(code)).build();
    }

        public static SuccessResponse getSuccessResponse(int code, String description) {
        if (description != null && description.length() > 0) {
            return SuccessResponse.builder().code(code).message(description).build();
        }
        return SuccessResponse.builder().code(code).message(getDescription(code)).build();
    }

        public static ErrorResponse getErrorResponse(int code) {
        return ErrorResponse.builder().code(code).message(getDescription(code)).build();
    }

        public static ErrorResponse getErrorResponse(int code, String description) {
        if (description != null && description.length() > 0) {
            return ErrorResponse.builder().code(code).message(description).build();
        }
        return ErrorResponse.builder().code(code).message(getDescription(code)).build();
    }




    }

