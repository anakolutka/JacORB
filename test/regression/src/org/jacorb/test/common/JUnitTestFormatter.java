package org.jacorb.test.common;

import java.io.OutputStream;
import junit.framework.AssertionFailedError;
import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.taskdefs.optional.junit.JUnitResultFormatter;
import org.apache.tools.ant.taskdefs.optional.junit.JUnitTest;
import org.junit.Test;

public class JUnitTestFormatter implements JUnitResultFormatter
{
    public void endTestSuite(JUnitTest junittest) throws BuildException {
        // TODO Auto-generated method stub

    }

    public void setOutput(OutputStream outputstream) {
        // TODO Auto-generated method stub

    }

    public void setSystemError(String s) {
        // TODO Auto-generated method stub

    }

    public void setSystemOutput(String s) {
        // TODO Auto-generated method stub

    }

    public void startTestSuite(JUnitTest junittest) throws BuildException {
        // TODO Auto-generated method stub

    }

    public void addError(Test arg0, Throwable arg1) {
        // TODO Auto-generated method stub

    }

    public void addFailure(Test arg0, AssertionFailedError arg1) {
        // TODO Auto-generated method stub

    }

    public void endTest(Test arg0) {
        // TODO Auto-generated method stub

    }

    public void startTest(Test arg0)
    {
        if (TestUtils.verbose)
        {
            System.err.println(arg0);
        }
    }

    @Override
    public void addError(junit.framework.Test arg0, Throwable arg1)
    {
        // TODO Auto-generated method stub

    }

    @Override
    public void addFailure(junit.framework.Test arg0, AssertionFailedError arg1)
    {
        // TODO Auto-generated method stub

    }

    @Override
    public void endTest(junit.framework.Test arg0)
    {
        // TODO Auto-generated method stub

    }

    @Override
    public void startTest(junit.framework.Test arg0)
    {
        // TODO Auto-generated method stub

    }

}
