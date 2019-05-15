package ch.silviowangler.geb.pages

import geb.Page
import geb.navigator.Navigator

/**
 * @author Silvio Wangler
 */
class GoogleFrontPage extends Page {

    static url = '/'

    static at = {
        title == 'Google'
    }

    static content = {
        searchInputField { $("input", name: "q") }

        searchButton {
            Navigator navigator = $("form", name: "f").find(name: "btnK", type: "submit", "input")

            if (navigator.size() == 1) {
                return navigator.singleElement()
            } else if (navigator.size() > 1) {
                return navigator.lastElement()
            }
            throw new RuntimeException("Element not found")
        }

        searchResultsContainer { $('#sbfrm_l') }

        searchResults { $('div.r').find('h3') }

        firstResult { searchResults[0] }
    }
}
