package com.delkabo.tests;

import com.delkabo.components.SportMasterObject;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class SportMaster extends TestBase{

    SportMasterObject sportMasterObject = new SportMasterObject();

    @Test
    @DisplayName("Search qa automation vacancies")

    void sportMaster() {
        String searched = "Qa automation";

        sportMasterObject.openPage()
                .clickTab()
                .clickPage()
                .searchVac("QA AUTOMATION")
                .clickSearch("Qa automation (остин)")
                .haveTitle("Qa automation (остин)");
//    }
    }
}
