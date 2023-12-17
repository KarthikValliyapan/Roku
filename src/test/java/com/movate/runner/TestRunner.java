package com.movate.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "D:\\Roku_Workspace_Git\\Roku\\src\\test\\java\\com\\movate\\featurefiles", 
							  glue = "com.movate.stepdefinition",
							  tags = "@test",
							  dryRun = false,
							  monochrome = false)
	
public class TestRunner
	{
		
	}
