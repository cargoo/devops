package org.cargoo.ansible.test;

import org.cargoo.ansible.AnsibleHelper;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class MainTestAnsible {

    @Before
    public void setUp() {


    }

    @Test
    public void test01() {
        Map<String, Object> ansibleSettingsMap = new HashMap<>();
        Map<String, Object> playbookParamMap = new HashMap<>();
        String playbookPath = "/home/ansible/ansible/test_role.yml";

        ansibleSettingsMap.put("ansible_ssh_hosts_path", "/home/ansible/ansible/hosts");
        ansibleSettingsMap.put("ansible_ssh_host", "192.168.176.112");
        ansibleSettingsMap.put("ansible_ssh_user", "root");
        ansibleSettingsMap.put("ansible_ssh_pass", "oracle");

        AnsibleHelper.doDeploy(ansibleSettingsMap, playbookParamMap, playbookPath);
    }

    @After
    public void tearDown() {

    }
}
