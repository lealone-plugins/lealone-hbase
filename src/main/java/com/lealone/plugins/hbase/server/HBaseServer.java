/*
 * Copyright Lealone Database Group.
 * Licensed under the Server Side Public License, v 1.
 * Initial Developer: zhh
 */
package com.lealone.plugins.hbase.server;

import java.util.Map;

import com.lealone.common.logging.Logger;
import com.lealone.common.logging.LoggerFactory;
import com.lealone.db.scheduler.Scheduler;
import com.lealone.net.WritableChannel;
import com.lealone.server.AsyncServer;

public class HBaseServer extends AsyncServer<HBaseServerConnection> {

    @SuppressWarnings("unused")
    private static final Logger logger = LoggerFactory.getLogger(HBaseServer.class);

    public static final String VERSION = "7.2";
    public static final int DEFAULT_PORT = 60020;

    @Override
    public String getType() {
        return HBaseServerEngine.NAME;
    }

    @Override
    public void init(Map<String, String> config) {
        super.init(config);
    }

    @Override
    public synchronized void start() {
        super.start();
    }

    @Override
    protected int getDefaultPort() {
        return DEFAULT_PORT;
    }

    @Override
    protected HBaseServerConnection createConnection(WritableChannel writableChannel,
            Scheduler scheduler) {
        return new HBaseServerConnection(this, writableChannel, scheduler);
    }

    @Override
    protected void beforeRegister(HBaseServerConnection conn, Scheduler scheduler) {
    }
}
