package com.jayway.maven.plugins.android.configuration;

import com.jayway.maven.plugins.android.AndroidNdk;

/**
 * @author
 */
public class NDKArchitectureToolchainMappings
{
    String x86 = AndroidNdk.X86_TOOLCHAIN[0];
    String armeabi = AndroidNdk.ARM_TOOLCHAIN[0];
    String arm64 = AndroidNdk.ARM64_TOOLCHAIN[0];
    String mips = AndroidNdk.MIPS_TOOLCHAIN[0];

    public String getArmeabi()
    {
        return armeabi;
    }

    public void setArmeabi( final String armeabi )
    {
        this.armeabi = armeabi;
    }

    public String getArm64()
    {
        return arm64;
    }

    public void setArm64( final String arm64 )
    {
        this.arm64 = arm64;
    }

    public String getMips()
    {
        return mips;
    }

    public void setMips( final String mips )
    {
        this.mips = mips;
    }

    public String getX86()
    {
        return x86;
    }

    public void setX86( final String x86 )
    {
        this.x86 = x86;
    }

}
