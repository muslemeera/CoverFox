package dataProviderUse;

import org.testng.annotations.DataProvider;

public class FBDataProvider {

	// method===> data provider
	// string ===> String firstName, string lastname,string mobNum
	@DataProvider(name = "FBRegression")

	public static String[][] fbDataSet() 
	{
		String data[][] = {{ "Meera", "sirsath", "9658966856"},{"Krishiv","Sirsath","862564893"},
				{ "Deepak","Sirsath","8635555556"}};
		return data;
	}

	@DataProvider(name = "FBSmoke")

	public static String[][] fbDataSet1()

	{
		String data[][] = {{ "Dipali","Musle", "9658966856" },{"Reyansh","Sirsath","862564893" },
				{"Adwitaa","Sirsath","8635555556"}};
		return data;
	}

}
