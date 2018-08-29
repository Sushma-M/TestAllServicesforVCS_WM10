/*Copyright (c) 2016-2017 vcstest4.com All Rights Reserved.
 This software is the confidential and proprietary information of vcstest4.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with vcstest4.com*/
package com.testallservicesforvcs.adventureworks2014.service;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/

import java.util.Map;

import javax.validation.Valid;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.wavemaker.runtime.data.exception.EntityNotFoundException;
import com.wavemaker.runtime.data.export.ExportType;
import com.wavemaker.runtime.data.expression.QueryFilter;
import com.wavemaker.runtime.data.model.AggregationInfo;
import com.wavemaker.runtime.file.model.Downloadable;

import com.testallservicesforvcs.adventureworks2014.VjobCandidateEmployment;
import com.testallservicesforvcs.adventureworks2014.VjobCandidateEmploymentId;

/**
 * Service object for domain model class {@link VjobCandidateEmployment}.
 */
public interface VjobCandidateEmploymentService {

    /**
     * Creates a new VjobCandidateEmployment. It does cascade insert for all the children in a single transaction.
     *
     * This method overrides the input field values using Server side or database managed properties defined on VjobCandidateEmployment if any.
     *
     * @param vjobCandidateEmployment Details of the VjobCandidateEmployment to be created; value cannot be null.
     * @return The newly created VjobCandidateEmployment.
     */
	VjobCandidateEmployment create(@Valid VjobCandidateEmployment vjobCandidateEmployment);


	/**
	 * Returns VjobCandidateEmployment by given id if exists.
	 *
	 * @param vjobcandidateemploymentId The id of the VjobCandidateEmployment to get; value cannot be null.
	 * @return VjobCandidateEmployment associated with the given vjobcandidateemploymentId.
     * @throws EntityNotFoundException If no VjobCandidateEmployment is found.
	 */
	VjobCandidateEmployment getById(VjobCandidateEmploymentId vjobcandidateemploymentId) throws EntityNotFoundException;

    /**
	 * Find and return the VjobCandidateEmployment by given id if exists, returns null otherwise.
	 *
	 * @param vjobcandidateemploymentId The id of the VjobCandidateEmployment to get; value cannot be null.
	 * @return VjobCandidateEmployment associated with the given vjobcandidateemploymentId.
	 */
	VjobCandidateEmployment findById(VjobCandidateEmploymentId vjobcandidateemploymentId);


	/**
	 * Updates the details of an existing VjobCandidateEmployment. It replaces all fields of the existing VjobCandidateEmployment with the given vjobCandidateEmployment.
	 *
     * This method overrides the input field values using Server side or database managed properties defined on VjobCandidateEmployment if any.
     *
	 * @param vjobCandidateEmployment The details of the VjobCandidateEmployment to be updated; value cannot be null.
	 * @return The updated VjobCandidateEmployment.
	 * @throws EntityNotFoundException if no VjobCandidateEmployment is found with given input.
	 */
	VjobCandidateEmployment update(@Valid VjobCandidateEmployment vjobCandidateEmployment) throws EntityNotFoundException;

    /**
	 * Deletes an existing VjobCandidateEmployment with the given id.
	 *
	 * @param vjobcandidateemploymentId The id of the VjobCandidateEmployment to be deleted; value cannot be null.
	 * @return The deleted VjobCandidateEmployment.
	 * @throws EntityNotFoundException if no VjobCandidateEmployment found with the given id.
	 */
	VjobCandidateEmployment delete(VjobCandidateEmploymentId vjobcandidateemploymentId) throws EntityNotFoundException;

    /**
	 * Deletes an existing VjobCandidateEmployment with the given object.
	 *
	 * @param vjobCandidateEmployment The instance of the VjobCandidateEmployment to be deleted; value cannot be null.
	 */
	void delete(VjobCandidateEmployment vjobCandidateEmployment);

	/**
	 * Find all VjobCandidateEmployments matching the given QueryFilter(s).
     * All the QueryFilter(s) are ANDed to filter the results.
     * This method returns Paginated results.
	 *
     * @deprecated Use {@link #findAll(String, Pageable)} instead.
	 *
     * @param queryFilters Array of queryFilters to filter the results; No filters applied if the input is null/empty.
     * @param pageable Details of the pagination information along with the sorting options. If null returns all matching records.
     * @return Paginated list of matching VjobCandidateEmployments.
     *
     * @see QueryFilter
     * @see Pageable
     * @see Page
	 */
    @Deprecated
	Page<VjobCandidateEmployment> findAll(QueryFilter[] queryFilters, Pageable pageable);

    /**
	 * Find all VjobCandidateEmployments matching the given input query. This method returns Paginated results.
     * Note: Go through the documentation for <u>query</u> syntax.
	 *
     * @param query The query to filter the results; No filters applied if the input is null/empty.
     * @param pageable Details of the pagination information along with the sorting options. If null returns all matching records.
     * @return Paginated list of matching VjobCandidateEmployments.
     *
     * @see Pageable
     * @see Page
	 */
    Page<VjobCandidateEmployment> findAll(String query, Pageable pageable);

    /**
	 * Exports all VjobCandidateEmployments matching the given input query to the given exportType format.
     * Note: Go through the documentation for <u>query</u> syntax.
	 *
     * @param exportType The format in which to export the data; value cannot be null.
     * @param query The query to filter the results; No filters applied if the input is null/empty.
     * @param pageable Details of the pagination information along with the sorting options. If null exports all matching records.
     * @return The Downloadable file in given export type.
     *
     * @see Pageable
     * @see ExportType
     * @see Downloadable
	 */
    Downloadable export(ExportType exportType, String query, Pageable pageable);

	/**
	 * Retrieve the count of the VjobCandidateEmployments in the repository with matching query.
     * Note: Go through the documentation for <u>query</u> syntax.
     *
     * @param query query to filter results. No filters applied if the input is null/empty.
	 * @return The count of the VjobCandidateEmployment.
	 */
	long count(String query);

	/**
	 * Retrieve aggregated values with matching aggregation info.
     *
     * @param aggregationInfo info related to aggregations.
     * @param pageable Details of the pagination information along with the sorting options. If null exports all matching records.
	 * @return Paginated data with included fields.

     * @see AggregationInfo
     * @see Pageable
     * @see Page
	 */
	Page<Map<String, Object>> getAggregatedValues(AggregationInfo aggregationInfo, Pageable pageable);


}

