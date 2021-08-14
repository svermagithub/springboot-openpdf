package com.pdf.example;

import java.util.HashMap;
import java.util.Map;

public class IncomeandEmploymentConstants {
    private IncomeandEmploymentConstants() {
    }

    public static final String ADDRLINETEXT_REQUIRED = " line1 is required";
    public static final String ADDRLINETEXT_INVALID = " line1 is invalid";
    public static final String ADDR_ADDITIONALLINETEXT_INVALID = " line2 is invalid";
    public static final String CITYNAME_INVALID = " city is invalid";
    public static final String STATECODE_INVALID = " state is invalid";
    public static final String POSTALCODE_REQUIRED = " zipCode is required";
    public static final String POSTALCODE_INVALID = " zipCode is invalid";
    public static final String LINE1 = "^[a-zA-Z0-9\\s\\#\\-\\.\\,\\/]{1,68}$";
    public static final String LINE2 = "^[a-zA-Z0-9\\s\\#\\-\\.\\,\\/]{1,25}$";
    public static final String LINE3 = "^[a-zA-Z0-9\\s\\#\\-\\.\\,\\/]{1,25}$";
    public static final String CITY = "^[a-zA-Z\\s]{0,38}$";
    public static final String STATE = "^[a-zA-Z]{0,2}$";
    public static final String ZIP = "^[a-zA-Z0-9\\s\\-]{1,10}$";
    public static final String IPADDRESS_PATTERN = "^([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\."
            + "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." + "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\."
            + "([01]?\\d\\d?|2[0-4]\\d|25[0-5])$";
    public static final String ALPHA_NUM_REGEX = "^[a-zA-Z0-9]*$";
    public static final String ALPHA_NUM_DOTS_REGEX = "^[a-zA-Z0-9.]*$";
    public static final String ALPHA_NUM_SPACE_REGEX = "^[a-zA-Z0-9\\s\\-.]*$";

    public static final String ALPHA_NUM_SPECIAL_REGEX="^[-@~`$\\*\\^\\.\\/#&%'!?,:;_|+\\w\\s\\u0080-\\uFFFF]{1,64}$";
    public static final String ALPHA_REGEX = "^[a-zA-Z]*$";
    public static final String PHONE_NUMBER = "^\\d{10}$|^\\(\\d{3}\\)\\d{3}-\\d{4}$|^\\d{3}-\\d{3}-\\d{4}$|^\\d{3}\\.\\d{3}\\.\\d{4}$";
    public static final String PHONE_TYPE = "(R|B|P|I|F|C|T|^$)";

    public static final String SAFE_REGEX = "^[a-zA-Z0-9_.\\- ]+$"; // Accepts hyphen and dots
    //public static final String BIRTHDAY_INVALID = "Dob day is invalid";
    public static final int EWACS_USERID_LENGTH = 255;
    //ReportTypes-Initial Pulls
    public static final String REPORT_TYPE_PLUS = "ExpVerify-Plus";
    public static final String REPORT_TYPE_PREMIUM = "ExpVerify-Premium";
    public static final String REPORT_TYPE_ENHANCED_CORE = "ExpVerify-Core";
    public static final String REPORT_TYPE_VERIFY_EMPLOYMENT = "ExpVerify-Employment";

    //ReportTypes-2nd pull
    public static final String REPORT_TYPE_REVERIFY_VOIE = "ExpVerify-Reverify-VOIE";
    public static final String REPORT_TYPE_REVERIFY_VOE = "ExpVerify-Reverify-VOE";

    //ReportTypesToEBD
    public static final String REPORT_TYPE_PREMIUM_REVERIFICATION_VOIE = "ExpVerify-Premium-Reverification VOIE";
    public static final String REPORT_TYPE_PREMIUM_REVERIFICATION_VOE = "ExpVerify-Premium-Reverification VOE";
    public static final String REPORT_TYPE_VERIFY_EMPLOYMENT_EBD = "ExpVerify- HR";


    public static final String EDS_REPORT_TYPE_STANDARD = "standard";
    public static final String EDS_REPORT_TYPE_ENHANCED = "enhanced";
    public static final String EDS_REPORT_TYPE_BASIC_EMPLOYMENT = "basicemployment";
    public static final String CITYNAME_REQUIRED = "City is required";
    public static final String STATECODE_REQUIRED = "State is required";
    public static final String CITY_STATE_OR_ZIP_REQUIRED = "City and State or Zip is required";
    public static final String ENDUSERNAME_PREFIX_FOR_MASTER_SUBCODE = "U-";
    public static final String ENDUSERNAME_PREFIX_LOWER_CASE_FOR_MASTER_SUBCODE = "u-";


    //Report Type
    public static final String VOIE_TYPE = "ExpVerify-Plus";
    public static final String NUM_REGEX = "\\d+";

    public static final String SUCCESS = "Success";
    public static final String FAILURE = "Failure";
    public static final String ERROR = "Error";
    public static final String INFO = "INFO";

    public static final String ERRORS = "errors";

    public static final String RESPONSE_CODE_SUCCESS = "0000";
    public static final String RESPONSE_CODE_INVALID_REQUEST = "1000";
    public static final String RESPONSE_CODE_SYSTEM_ERROR_CODE = "4000";
    public static final String RESPONSE_CODE_SQL_CONNECTION_ERROR_CODE = "4004";
    public static final String RESPONSE_CODE_SQL_ERROR_CODE = "4005";

    //Statuscodes
    public static final String STATUS_SUCCESS = "200";
    public static final String STATUS_NO_DATA = "404";
    public static final String STATUS_NO_DATA_IN_90_DAYS = "404_90_days";
    public static final String STATUS_SERVER_ERROR = "500";

    //ERROR codes
    public static final String ERROR_CODE_REQUIRED = "1000";
    public static final String ERROR_CODE_INVALID = "1002";

    //Error Messages
    //public static final String RESPONSE_CODE_SQL_CONNECTION_ERROR_TYPE = "SQL Connection Error";
    //public static final String RESPONSE_CODE_SQL_ERROR_TYPE= "SQL Error";
    //public static final String RESPONSE_ERROR_MESSAGE = "Internal system error. Contact Experian Technical Support for more details.";
    public static final String RESPONSE_ERROR_MESSAGE = "Internal server error. Please contact Experian Support at 800-854-7201.";
    public static final String RESPONSE_BACKEND_ERROR = "backend error";
    public static final String INCOME_AND_EMPLOYMENT_REQUEST_REQUIRED = "IncomeAndEmploymentRequest is required";
    public static final String REPORT_TYPE_REQUIRED = "ReportType is required";
    public static final String EWACS_USERID_REQUIRED = "userID is required";
    public static final String COMPANY_ID_REQUIRED = "Company ID is required";
    public static final String ACCEPT_REQUIRED = "Accept header is required ";
    public static final String API_KEY_REQUIRED = "Required Header is missing";
    public static final String APPLICANT_INFORMATION_REQUIRED = "Applicant Information is required";
    public static final String CONSUMER_PII_REQUIRED = "Consumer PII is required";
    public static final String SSN_REQUIRED = "SSN is required";
    public static final String DOB_REQUIRED = "Dob is required";
    public static final String FIRST_NAME_REQUIRED = "FirstName is required";
    public static final String LAST_NAME_REQUIRED = "LastName is required";
    public static final String DATE_OF_CONSENT_REQUIRED = "Date of Consent is required";
    public static final String NAME_REQUIRED = "Missing name in request";
    public static final String SIGNATURE_TYPE_REQUIRED = "Signature Type is required";
    public static final String VERIFIER_NAME_REQUIRED = "VerifierName is required";
    public static final String SUBSCRIBER_CODE_REQUIRED = "subscriberCode is required";
    public static final String REQUESTOR_REQUIRED = "Missing requestor in request";
    public static final String ADDRESS_REQUIRED = "Address is required";
    public static final String PURPOSE_TYPE_REQUIRED = "Purpose type is required";
    public static final String PERMISSIBLE_PURPOSE_REQUIRED = "Missing permissible Purpose in request";
    public static final String CONSUMER_CONSENT_REQUIRED = "Missing consumerCertification in request";

    public static final String END_USER_NAME_REQUIRED  = "End User Name is required";
    public static final String RESELLER_END_USER_NAME_REQUIRED  = "Reseller.End User Name is required";

    public static final String REPORT_TYPE_INVALID = "ReportType is invalid";
    public static final String EWACS_USERID_INVALID = "userID is invalid";
    public static final String CLIENT_REFERENCE_ID_INVALID = "Client Reference ID is invalid";
    public static final String EXPERIAN_TRANSACTION_ID_INVALID = "Experian Transaction ID is invalid";
    public static final String COMPANY_ID_INVALID = "Company ID is invalid";
    public static final String ACCEPT_INVALID = "Accept header is invalid ";
    public static final String API_KEY_INVALID = "Header is invalid";
    public static final String SSN_INVALID = "SSN is invalid";
    public static final String FIRST_NAME_INVALID = "FirstName is invalid";
    public static final String LAST_NAME_INVALID = "LastName is invalid";
    public static final String NAME_INVALID = "Name is invalid";

    public static final String MIDDLE_NAME_INVALID = "MiddleName is invalid";
    public static final String GENERATION_CODE_INVALID = "Generation Code is invalid";
    public static final String DOB_INVALID = "Dob is invalid";
    public static final String DATE_OF_CONSENT_INVALID = "Date of Consent is invalid";
    public static final String SIGNATURE_TYPE_INVALID = "Signature Type  is invalid";
    public static final String VERIFIER_NAME_INVALID = "VerifierName is invalid";
    public static final String SUBSCRIBER_CODE_INVALID = "subscriberCode is invalid";
    public static final String SUBSCRIBER_CODE_INVALID_CUSTOMER_MASTER = "subscriberCode is invalid.Please contact Experian Support at 800-854-7201.";
    public static final String SUBSCRIBER_CODE_INACTIVE = "SubscriberCode is Inactive";
    public static final String SUBSCRIBER_CODE_INVALID_DATA_PROVIDERS_NULL = "No Data Providers selected for given SubscriberCode.Please contact Experian Support at 800-854-7201.";
    public static final String PURPOSE_TYPE_INVALID = "Purpose type is invalid";
    //public static final String CONSUMER_CONSENT_INVALID = "Request cannot be processed. Certification that consumer has been provided with required disclosures and has provided written consent is required.";
    public static final String CONSUMER_CERTIFICATION_INVALID = "Request cannot be processed. Certification that consumer has been provided with required disclosures and has provided written consent is required.";
    public static final String END_USER_NAME_INVALID = "End User Name is invalid";
    public static final String END_USER_NAME_INVALID_FOR_MASTER_SUBCODE = "End User Name is invalid. Must start with U-";
    public static final String VENDOR_NUMBER_INVALID = "Vendor Number is invalid";
    public static final String VENDOR_VERSION_INVALID = "Vendor Version is invalid";
    public static final String VENDER_NAME_COMBO_INVALID = "Validation Failed";
    public static final String VENDOR_NUMBER_REQUIRED = "Vendor Number is required";
    public static final String VENDOR_DATA_REQUIRED = "Vendor Data is required";




    //Header Fields
    public static final String REQUEST_PAYLOAD = "payload";
    public static final String REQUEST_CLIENT_REFERENCE_ID = "clientReferenceId";
    public static final String REQUEST_EXPERIAN_TRANSACTION_ID = "experianTransactionId";
    public static final String REQUEST_USER_ID = "userId";
    public static final String REQUEST_COMPANY_ID = "companyId";
    public static final String REQUEST_ACCEPT = "Accept";
    public static final String REQUEST_API_KEY = "apiKey";
    public static final String REQUEST_OUTPUT_DATA = "outputData";
    public static final String REQUEST_PROFILE_VERSION = "profileVersion";
    public static final String PINNING_PROFILE_VERSION = "07";
    public static final String PINNING_OPTION_ID = "F1PIN";
    public static final String PINNING_UNIQUE_CONSUMER_ID =  "uniqueConsumerIdentifier";
    public static final String PINNING_UNIQUE_CONSUMER_ID_VALUE = "value";
    public static final String EBD_TRANSACTION_ID = "transactionId";
    public static final String EBD_CALLING_SYSTEM = "callingSystem";
    public static final String EBD_CALLING_SYSTEM_VALUE = "Verification Services";
    public static final String EBD_API_KEY = "apiKey";

    public static final String RESPONSE_ADP_CORRELATION_ID = "adp-ADP-CorrelationID";
    public static final String RESPONSE_adp_CORRELATION_ID = "adp-adp-correlationid";
    public static final String RESPONSE_GRANITE_CORRELATION_ID = "granite-correlationid";

    //ADP Deductions
    public static final String ADP_SOCIAL_SECURITY_TAX = "Social security tax";
    public static final String ADP_FEDERAL_TAX = "Federal tax";
    public static final String ADP_STATE_TAX = "State tax";
    public static final String ADP_LOCAL_TAX = "Local tax";
    public static final String ADP_RETIREMENT_DEDUCTIONS = "Retirement deductions";
    public static final String ADP_GARNISHMENT_DEDUCTIONS = "Garnishment deductions";
    public static final String ADP_MEDICARE_TAX = "Medicare tax";
    public static final String ADP_BENEFIT_DEDUCTIONS = "Benefit deductions";
    public static final String ADP_SUI_SDI_VPDI_TAX = "SUI SDI VPDI tax";
    public static final String ADP_OTHER_DEDUCTIONS = "Other deductions";
    public static final String ADP_REMUNERATION_OVERTIME = "YTD Overtime";
    public static final String ADP_REMUNERATION_BONUS = "YTD Bonus";
    public static final String ADP_REMUNERATION_OTHER= "YTD Others";

    public static final String GRANITE_CURRENCY_CODE = "USD";
    public static final String GRANITE_OVERTIME = "Overtime";
    public static final String GRANITE_BONUS = "Bonus";
    public static final String GRANITE_COMMISSION = "Comission";
    public static final String GRANITE_REGULAR= "Regular";
    public static final String GRANITE_OTHER = "Other";
    public static final String GRANITE_REMUNERATION_GROSSPAY= "GrossPayAmount";
    public static final String GRANITE_REMUNERATION_BASEPAY= "BasePayAmount";
    public static final String GRANITE_REMUNERATION_OVERTIME= "OvertimePayAmount";
    public static final String GRANITE_REMUNERATION_BONUSPAY= "BonusPayAmount";
    public static final String GRANITE_REMUNERATION_OTHERPAY= "OtherPayAmount";

    //SourceIds
    public static final String ADP_SOURCE_ID = "00A";
    public static final String GRANITE_SOURCE_ID = "00C";
    public static final String NO_DISPUTES = "No Disputes";

    //VendorCodes
	/*public static final String CLARITY_VENDOR_CODE = "Z54";
	public static final String EIFF_VENDOR_CODE = "00E";
	public static final String AFS_VENDOR_CODE = "AFS";*/

    //Data Providers
    public static final String DATA_PROVIDER_ADP = "adp";
    public static final String DATA_PROVIDER_GRANITE = "granite";

    public static final String FORBIDDEN_REQUEST = "forbidden";
    public static final String BAD_REQUEST = "bad request";
    public static final String INVALID_PURPOSE_TYPE = "No valid marketsegment present for given purpose code :";
    public static final String DISPUTE_ERROR="consumer is in dispute state with Experian, request cannot be completed";
    public static final String ADP_DATE_FORMAT = "yyyy-MM-dd";
    public static final String GRANITE_DATE_FORMAT = "M/d/yyyy";
    public static final String IHIS_DATE_FORMAT = "MMddyyyy";
    //
    public static final String RESPONSE_HEADERS = "headers";
    public static final String GRANITE_TIMESTAMP = "timestamp";
    public static final String ADP_AS_OF_DATE = "asOfDate";
    public static final String ADP_GOVERNMENT_ID = "governmentID";
    public static final String ADP_AS_OF_DATE_FORMAT = "yyyy-MM-dd";
    //public static final String GRANITE_TIMESTAMP_FORMAT = "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'";
    public static final String GRANITE_TIMESTAMP_FORMAT = "yyyy-MM-dd";
    //Billing Service
    public static final String BILLING_FLOW_NAME = "flowName";;
    public static final String BILLING_API_ORIGIN = "apiOrigin";
    public static final String BILLING_REPORT_TYPE = "reportType";
    public static final String BILLING_VERIFICATION_ID = "verificationId";
    public static final String BILLING_SUBCODE = "subcode";
    public static final String BILLING_REQUEST_DATE = "requestDate";
    public static final String BILLING_EWACS_USER_ID = "ewacsUserId";
    public static final String BILLING_PRODUCT = "product";
    public static final String BILLING_STATUS = "status";
    public static final String BILLING_CORRELATION_ID = "correlationId";

    //loggers
    public static final String LOGGER_SUBCODE = "SubCode=";
    public static final String LOGGER_PERMISSIBLE_PURPOSE =  "PermissiblePurpose=";
    public static final String LOGGER_PINNING_RESPONSE_HIT = "PinningResponseHit=";
    public static final String LOGGER_ADP_RESPONSE_HIT = "ADPHitRespone=";
    public static final String LOGGER_GRANITE_RESPONSE_HIT = "GraniteHitResponse=";
    public static final String LOGGER_STATUS = "Status=";
    public static final String LOGGER_HIT_OR_NOHIT =  "TransactionHitResponse=";
    public static final String LOGGER_NO_HIT_VALUE =  "NO-HIT";
    public static final String LOGGER_HIT_VALUE =  "HIT";
    public static final String LOGGER_DATA_PROVIDERS_INVOKED = "DataProviders invoked=";

    //internal Verifier names
    public static final String VERIFIER_NAME_CONSUMER_ASSISTANCE = "Consumer Assistance";
    public static final String VERIFIER_NAME_EXPERIAN = "Experian";
    public static final String PERMISSIBLE_PURPOSE_INTERNAL = "84";
    public static final String JSON_PARSE_ERROR = "JSON parse error: Unexpected character";

    public static final String ADP_MAX_PAY_PERIOD = "ADP_MAX_PAY_PERIOD";
    public static final String GRANITE_MAX_PAY_PERIOD = "GRANITE_MAX_PAY_PERIOD";

    public static final String LABEL_NAME_INVALID = "Name is invalid";
    public static final String LABEL_VALUE_INVALID = "Value is invalid";
    public static final String LABEL_VALUE_REQUIRED = "Value is required";
    public static final String LABEL_NAME_REQUIRED = "Name is required";


    public static final String CUSTOM_LABELS_REQUIRED = "ReportCustomLabels is required";
    public static final String LABEL = "Label";
    public static final String DATA_PROVIDER = "dataprovider";
    public static final String OPTIONID_CUSTOMER_COPY = "Customer Copy";

    public static final String WORK_STATUS_ACTIVE = "Active";
    public static final String WORK_STATUS_ON_LEAVE = "On Leave";
    public static final String GENERATION_CODE = "Sr,sr,SR,sR,Jr,jr,JR,jR,II,III,IV,V,VI,VII,VIII,IX,2,3,4,5,6,7,8,9,";
    public static final String DUPLICATE_KEYS_ERROR_MESSAGE = "Duplicate key in Json Request.";
    public static final String ORIGINAL_REPORT_ID = "originalReportId";

    public static final String REVERIFICATION_REPORT_ERROR ="consumer mismatch with previous pull";
    public static final String REVERIFICATION_REPORT_DECRYPT_ERROR ="error due to decryption";

    public static final String REVERIFY_NO_INITIAL_REPORT_ERROR  = "No initial report was found for a reverification to be requested. Please check inputs or submit a new Premium or Core verification request.";
    public static final String REVERIFY_NO_INITIAL_REPORT_ERROR_TYPE = "Data not found: Action not allowed.";

    public static final String REVERIFY_SUBCODE_PERMISSIBLE_CODE_MISMATCH_ERROR  = "The subcode and/or purpose type submitted does not match the initial verification request. Please check inputs or submit a new Premium or Core verification request";
    public static final String REVERIFY_REPORT_ALREADY_EXISTS = "A reverification has already been generated for this consumer. Please check inputs or submit a new Premium or Core verification request.";
    public static final String REVERIFY_REPORT_ALREADY_EXISTS_ERROR_TYPE = "Data already found: Action not allowed.";

    public static final String REVERIFY_CONSUMER_DATA_MISMATCH = "consumer data mismatch";
    public static final String REVERIFY_NOT_ALLOWED_ERROR_MSG = "Reverify report pull not allowed for Permissible purpose ";
    public static final String REVERIFY_NOT_ALLOWED_ERROR_CODE = "8001";

    public static final String GETDATABYSINV2_RC_2_ERROR_MSG  = "Missing input argument";
    public static final String GETDATABYSINV2_RC_3_ERROR_MSG  = "SUBSCRIBER_CREDIT row read error for SIN=";

    public static final String GETDATABYSINPREAM_RC_2_ERROR_MSG  = "SUBSCRIBER_CREDIT row not found for SIN=%d PREAMBLE=%s";
    public static final String GETDATABYSINPREAM_RC_3_ERROR_MSG  = "Unable to allocate storage for Exception Includes";
    public static final String GETDATABYSINPREAM_RC_4_ERROR_MSG  = "Error querying BASE_SERVICES table for type";
    public static final String DOB_MINOR_INVALID = "Consumer is minor";

    public static final Map<String,String> labelNameMap = new HashMap<String, String>();
    static {
        labelNameMap.put(REQUEST_CLIENT_REFERENCE_ID, "Client Reference ID");
        labelNameMap.put(REQUEST_USER_ID, "Ewacs UserID");
        labelNameMap.put(REQUEST_COMPANY_ID, "Company ID");
        labelNameMap.put(REQUEST_EXPERIAN_TRANSACTION_ID, "Experian Transaction ID");
    }

}