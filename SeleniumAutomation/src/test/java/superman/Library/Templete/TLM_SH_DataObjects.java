package superman.Library.Templete;

import superman.Generic.BaseClass;
import superman.Library.PageObject.TLM_SH_Page;

public class TLM_SH_DataObjects extends BaseClass {

	public static void PlanAndMeet() throws Exception {

		while (true) {
			if (!TLM_SH_Page.DailyPlan().isDisplayed()) {
				break;
			} else {
				TLM_SH_Page.btn_PlanAndMeet().click();
			}
		}

		/*
		 * try { if ((TLM_SH_Page.btn_PlanAndMeet().isEnabled()) &&
		 * (TLM_SH_Page.btn_PlanAndMeet().isDisplayed())) {
		 * 
		 * Action.Doubleclick(TLM_SH_Page.btn_PlanAndMeet());
		 * Js.Click(TLM_SH_Page.btn_PlanAndMeet());
		 * 
		 * System.out.println("Action Performed on PlanAndMeet"); } } catch (Exception
		 * e) { System.out.println("Action Performed on PlanAndMeet"); }
		 */
	}
}
