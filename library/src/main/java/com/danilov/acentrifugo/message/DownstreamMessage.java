package com.danilov.acentrifugo.message;

import org.json.JSONObject;

/**
 * This file is part of ACentrifugo.
 *
 * ACentrifugo is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * ACentrifugo is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * You should have received a copy of the GNU General Public License
 * along with ACentrifugo.  If not, see <http://www.gnu.org/licenses/>.
 *
 * Created by semyon on 29.04.16.
 * */
public class DownstreamMessage {

    protected String requestUUID;

    protected JSONObject body;

    protected JSONObject originalMessage;

    public DownstreamMessage(final JSONObject jsonObject) {
        this.originalMessage = jsonObject;
        requestUUID = jsonObject.optString("uid");
        body = jsonObject.optJSONObject("body");
    }

    public String getRequestUUID() {
        return requestUUID;
    }

    public JSONObject getBody() {
        return body;
    }

    public JSONObject getOriginalMessage() {
        return originalMessage;
    }

}