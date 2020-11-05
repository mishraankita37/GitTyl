# Project Saucelab: Automation framework for automating key journeys of product addition to cart and checkout
# Technology Used: Java, Selenium WebDriver, TestNG, Maven
# Framework Used: TestNg
# Design pattern: Page Object Model
# Features:       Automates price sorting of Cart(price-Low to High) on {Products} Screen
                  Automates selection of cheapest and second costliest product on {Products} Screen
						      Adds the selected products into Cart on {Products} Screen
						      Selects Checkout button on {Your Cart} Screen
						      Enters First name, Last name and Post code (Array List) on {Checkout: Your Information} Screen
						      Continues with the details entered on {Checkout: Your Information} Screen
						      Selects Finish button on {Checkout:Overview} Screen

# Code and Test Strcuture: Created a package of resources with base class file(Browser driver methods) and Properties file for initialization
                           Created a package for page objects with four class files(for four screens)
													 Created a test file to execute the methdos of page object class files
													 Created a Testng. xml file to run the suite
