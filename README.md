# Geb Starter

A simple project to introduce [Geb][geb] to others.

This repository is based on the following steps. All steps are organized as Git tags. Whenever you get lost or you'd like to fast forward use

    git checkout tags/<tag-name>

If you would like to checkout the Git tag as a separate branch then use

    git checkout tags/<tag-name> -b <branch-name>

In order to list all available Git tags please use

    git tag -l

## Step by step introduction

* **Step-00:** Basic Geb setup using the Spock Framework with Google Chrome Webdriver and Gradle. The setup provides you a simple test that navigates to http://www.google.com/ and verifies the title of the site.
* **Step-01:** Enter some text into the Google Search textfield and start a query
* **Step-02:** Create a page object that represents the Google search page

[geb]: http://www.gebish.org/
