import java.util.UUID;


public class FirewallRule {

	private String sectionId;
//	private String applyTo; 
	private long ruleId;
	private String name;
	private String action;
	
	public String getId() {
		return sectionId;
	}
	
	public void setSectionId(String id) {
		this.sectionId = id;
	}
	
	public long getRuleId() {
		return ruleId;
	}
	
	public void setRuleId(long ruleId) {
		this.ruleId = ruleId;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getAction() {
		return action;
	}
	
	public void setAction(String action) {
		this.action = action;
	}
	
	@Override
	public String toString() {
		return "Rule ID:" + ruleId + " Section ID:" + sectionId + " Name:" + name + " Action:" + action; 
	}
	
	
}
