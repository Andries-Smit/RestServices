// This file was generated by Mendix Business Modeler 4.0.
//
// WARNING: Only the following code will be retained when actions are regenerated:
// - the import list
// - the code between BEGIN USER CODE and END USER CODE
// - the code between BEGIN EXTRA CODE and END EXTRA CODE
// Other code you write will be lost the next time you deploy the project.
// Special characters, e.g., é, ö, à, etc. are supported in comments.

package communitycommons.actions;

import java.util.Date;
import com.mendix.systemwideinterfaces.core.UserAction;
import communitycommons.DateTime;

/**
 * Converts a datetime to an integer based on the selector used.
 * 
 * Selectors available are:
 * - year (returns f. ex. 1980)
 * - month (returns 1-12)
 * - day (returns 1-31)
 */
public class GetIntFromDateTime extends UserAction<Long>
{
	private java.util.Date dateObj;
	private communitycommons.proxies.DatePartSelector selectorObj;

	public GetIntFromDateTime(java.util.Date dateObj, String selectorObj)
	{
		super();
		this.dateObj = dateObj;
		this.selectorObj = selectorObj == null ? null : communitycommons.proxies.DatePartSelector.valueOf(selectorObj);
	}

	@Override
	public Long executeAction() throws Exception
	{
		// BEGIN USER CODE
		return DateTime.dateTimeToInteger(dateObj, selectorObj);
		// END USER CODE
	}

	/**
	 * Returns a string representation of this action
	 */
	@Override
	public String toString()
	{
		return "GetIntFromDateTime";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}
