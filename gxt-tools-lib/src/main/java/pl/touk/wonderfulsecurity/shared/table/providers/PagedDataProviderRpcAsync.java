/*
 * Copyright (c) 2008 TouK.pl
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package pl.touk.wonderfulsecurity.shared.table.providers;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Map;

import pl.touk.wonderfulsecurity.beans.PagedQueryResult;

import com.google.gwt.user.client.rpc.AsyncCallback;

/**
 * @author mproch
 *
 */
public interface PagedDataProviderRpcAsync {

    public void fetchPagedListWithOverallCount(String caller, Map<String, Object> queryParameters, Integer offset, Integer howMany,
            String sortColumn, Boolean desc, String clazz,
            AsyncCallback<PagedQueryResult<ArrayList<? extends Serializable>>> callback);
}