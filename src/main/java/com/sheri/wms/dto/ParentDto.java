package com.sheri.wms.dto;

import java.util.ArrayList;

public class ParentDto {
	private boolean hasErrors;
	private boolean hasWarnings;
	private boolean hasInformations;
	private ArrayList<String> errors=new ArrayList<String>();
	private ArrayList<String> warnings=new ArrayList<String>();
	private ArrayList<String> informations=new ArrayList<String>();
	public void addError(String errorMsg)
	{
		hasErrors=true;
		errors.add(errorMsg);
	}
	public void addInformations(String infoMsg)
	{
		hasInformations=true;
		informations.add(infoMsg);
	}
	public boolean isHasErrors()
	{
		return hasErrors;
	}
	public void setHasErrors(boolean hasErrors)
	{
		this.hasErrors = hasErrors;
	}
	public boolean isHasWarnings()
	{
		return hasWarnings;
	}
	public void setHasWarnings(boolean hasWarnings)
	{
		this.hasWarnings = hasWarnings;
	}
	public boolean isHasInformations()
	{
		return hasInformations;
	}
	public void setHasInformations(boolean hasInformations)
	{
		this.hasInformations = hasInformations;
	}
	public ArrayList<String> getErrors() {
		return errors;
	}
	public void setErrors(ArrayList<String> errors)
	{
		this.errors = errors;
	}
	public ArrayList<String> getWarnings()
	{
		return warnings;
	}
	public void setWarnings(ArrayList<String> warnings)
	{
		this.warnings = warnings;
	}
	public ArrayList<String> getInformations()
	{
		return informations;
	}
	public void setInformations(ArrayList<String> informations)
	{
		this.informations = informations;
	}
	public boolean hasErrors()
	{
		return hasErrors;
	}
	public boolean hasInformations()
	{
		return hasInformations;
	}
}
