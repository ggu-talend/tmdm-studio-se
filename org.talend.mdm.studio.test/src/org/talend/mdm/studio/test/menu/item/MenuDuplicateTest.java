// ============================================================================
//
// Copyright (C) 2006-2011 Talend Inc. - www.talend.com
//
// This source code is available under agreement available at
// %InstallDIR%\features\org.talend.rcp.branding.%PRODUCTNAME%\%PRODUCTNAME%license.txt
//
// You should have received a copy of the agreement
// along with this program; if not, write to Talend SA
// 9 rue Pages 92150 Suresnes, France
//
// ============================================================================
package org.talend.mdm.studio.test.menu.item;

import org.eclipse.swtbot.swt.finder.junit.SWTBotJunit4ClassRunner;
import org.eclipse.swtbot.swt.finder.widgets.SWTBotMenu;
import org.eclipse.swtbot.swt.finder.widgets.SWTBotShell;
import org.eclipse.swtbot.swt.finder.widgets.SWTBotText;
import org.eclipse.swtbot.swt.finder.widgets.SWTBotTreeItem;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.talend.mdm.studio.test.TalendSWTBotForMDM;

/**
 * DOC rhou class global comment. Detailled comment
 */
@RunWith(SWTBotJunit4ClassRunner.class)
public class MenuDuplicateTest extends TalendSWTBotForMDM {

    private SWTBotTreeItem menuParentItem;

    private SWTBotTreeItem menuItem;

    @Before
    public void runBeforeEveryTest() {
        menuParentItem = serverItem.getNode("Menu [HEAD]");
        menuParentItem.expand();

        menuParentItem.contextMenu("New").click();
        SWTBotShell shell = bot.shell("New Menu");
        shell.activate();
        SWTBotText text = bot.textWithLabel("Enter a Name for the New Instance");
        text.setText("TestMenu");
        sleep();
        bot.button("OK").click();
        sleep();
        bot.activeEditor().save();
        menuItem = menuParentItem.getNode("TestMenu");
        Assert.assertNotNull(menuItem);
        sleep(2);
    }

    @Test
    public void menuDuplicateTest() {
        SWTBotMenu duplicateMenu = menuItem.contextMenu("Duplicate");
        duplicateMenu.click();
        SWTBotShell shell = bot.shell("Pasting instance TestMenu");
        shell.activate();
        bot.text("CopyOfTestMenu").setText("DuplicateMenu");
        sleep();
        bot.button("OK").click();
        SWTBotTreeItem duplicateNode = menuParentItem.getNode("DuplicateMenu");
        Assert.assertNotNull(duplicateNode);
        sleep(2);

    }

    @After
    public void runAfterEveryTest() {
        menuParentItem.getNode("TestMenu").contextMenu("Delete").click();
        sleep();
        bot.button("OK").click();
        sleep();

        menuParentItem.getNode("DuplicateMenu").contextMenu("Delete").click();
        sleep();
        bot.button("OK").click();
        sleep();

    }

}