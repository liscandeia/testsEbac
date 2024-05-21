package br.com.liscandeia;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import service.ClienteSevice;

@RunWith(Suite.class)
@Suite.SuiteClasses({ClienteServiceTest.class,ContratoServiceTest.class, ClienteTest.class})
public class AllTests {

}
