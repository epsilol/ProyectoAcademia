An example of automating a Web Form using WebDriver and ChromeDriver using Utilerias.PageObject model


Description of files used in the project:
Utilerias.PageObject: An parent Utilerias.PageObject that all classes should inherit to be able to perform WebDriver tests
Test.User_Story_Tests_7: A class that wires all test methods together
Utilerias.Utils: A configuration class that shows the location of chromedriver and constants related to general project configuration. Might also include helper methods in the futures
Pages.Home_pageage: A form class that includes all the locators, variables and methods for automating a Form Page. If automation of other webpages on the website is necessary, those pages should be created separately and should inherit the Utilerias.PageObject class

