package er.corebl.mail;

public enum ERCMailState {
	DRAFT,
	READY_TO_BE_SENT,
	WAIT,
	PROCESSING,
	OPT_OUT,
	SUPPRESSED,
	EXCEPTION,
	SENT,
	BOUNCED,
	RECEIVED;
}
