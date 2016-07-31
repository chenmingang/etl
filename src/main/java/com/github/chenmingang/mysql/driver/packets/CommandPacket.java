package com.github.chenmingang.mysql.driver.packets;

import org.apache.commons.lang.builder.ToStringBuilder;

public abstract class CommandPacket implements IPacket {

    private byte command;

    // arg

    public void setCommand(byte command) {
        this.command = command;
    }

    public byte getCommand() {
        return command;
    }

}
