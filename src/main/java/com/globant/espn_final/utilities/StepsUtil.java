package com.globant.espn_final.utilities;

import com.globant.espn_final.drivers.MyDriver;
import com.globant.espn_final.pages.EspnHomePage;

public class StepsUtil {
    public MyDriver driver = new MyDriver(System.getProperty("browser"));
    public EspnHomePage espn;
}
