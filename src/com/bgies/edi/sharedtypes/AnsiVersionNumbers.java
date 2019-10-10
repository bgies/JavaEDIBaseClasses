package com.bgies.edi.sharedtypes;

public enum AnsiVersionNumbers {
    UNKNOWN(0),
    VER1800(1800),
    VER2000(2000), VER2010(2010), VER2040(2040),
    VER3000(3000), VER3010(3010), VER3020(3020), VER3040(3040), VER3050(3050), VER3060(3060), VER3070(3070),
    VER4000(4000), VER4010(4010), VER4020(4020), VER4030(4030), VER4050(4050), VER4060(4060),
    VER5000(5000), VER5010(5010), VER5020(5020), VER5030(5030), VER5040(5040), VER5050(5050);

    private int versionNumber;

    private AnsiVersionNumbers(int versionNumber) {
        this.versionNumber = versionNumber;
    }

    public int toInt() {
        return versionNumber;
        /*		
		switch (versionNumber)
		{
		case VER1800 : return 1800; 
		
		}
         */

    }

}
