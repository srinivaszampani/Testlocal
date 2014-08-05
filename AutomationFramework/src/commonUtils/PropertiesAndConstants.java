package commonUtils;

	import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.HashMap;
	import java.util.Map;

import org.openqa.selenium.WebDriver;


	/// <summary>
	/// Author            : Srinivas zampani
	/// Description       : Declaring Constants And Variables
	/// </summary>


	public class PropertiesAndConstants{
		public static String GMSURLMecca = null;
		public static  String GMSURLCasino = null;
		public static  String Environment = null;
		public static Map<String, String> envDictionary = new HashMap<String, String>();
	    public static Map<String, String> objRepo = new HashMap<String, String>();
	    public static Map<String, String> objFrames = new HashMap<String, String>();
		public static Map<String, String> getObjMap()
		{
			return objRepo;
		}
		public static void setObjMap(Map<String, String> objMap)
		{
			PropertiesAndConstants.objRepo = objMap;
		}



		public static String CurrentDirectory;
		public static String Application;
		public static String TestType;
		public static String LogFile;
		public static String TempTestLogPath;
		public static String Url;
		public static String Repository;
		public static String ResultString;
		public static String scriptExecutionResult;
		public static WebDriver Selenium;
		public static boolean IsTestExecutionPassed;
		public static int TestCount;
		public static String TempTestSuitePath;
		public static String TestSuitePath;
		public static String EvnFilePath;
		public static String Browser;
		public static boolean isCreated=false;
		
	    public static String ExcelReportFile;
		public static String SetDefaultDriverConfig;
		
		
		 public static Boolean IsStepSkip;  
	     public static int FailStepsCountLimit; 
	     public static int FailStepsPerScriptCounter; 
	    // public static String ScriptExecutionResult; 

	     public static String TestScriptName;

	     //*****
	     public static String TempDirectoryPath;
	     public static String ScreenshotDirectoryPath; 
	     public static String TempTestScriptPath;
	     
	     public static String AppHomeDrive;
	 	 public static String TempScreenshotPath;
	     public static String TempPageSourcePath;
	     public static String MainDriverWindowHandle;
	     public static String AdditionalDriverWindowHandle;
	     public static Boolean IsFlashDisabled;
	 	public static String ReusableScriptPath;
		public static String finalScriptPath;
		public static String ReusablePath;


	     public static String TemplatePath; 
	     public static int TestPassCount; 
	     public static int TestFailCount; 
	     public static int JavaScriptErrorCount;
		public static String ScreenShotFullPath;
		public static String SuiteFile;
		public static String CurrentRunReportFolder;
		public static String date = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss a").format(Calendar.getInstance().getTime());
		 public static Map<String, String> testDataDictionary = new HashMap<String, String>();
		 
		 public static Map<String, String> varDataDictionary = new HashMap<String, String>();

		 public static boolean isTestDataFileExist = false;
		 
		 public static String EmailToList;
		 public static String EmailFrom;
		 public static String EmailHost;
		 public static String EmailPort;
		 public static String EmailUser;
		 public static String EmailPassword;		 
		
		public enum Browsers {
			FF,
			IE,
			CH,
			OP,
			AN,
			SA
		  }
		
}
