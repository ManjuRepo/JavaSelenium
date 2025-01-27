package superman.Library.Templete;

import superman.Generic.BaseClass.Action;
import superman.Library.PageObject.TLM_SH_Page;

public class TLM_SH_DataObjects {

	public static void PlanAndMeet() throws Exception {

		try {
			if ((TLM_SH_Page.btn_PlanAndMeet().isEnabled()) && (TLM_SH_Page.btn_PlanAndMeet().isDisplayed())) {
				Thread.sleep(25000);

				Action.Doubleclick(TLM_SH_Page.btn_PlanAndMeet());
				System.out.println("Action Performed on PlanAndMeet");
			}
		} catch (Exception e) {
			System.out.println("Action Performed on PlanAndMeet");
		}
	}
}
