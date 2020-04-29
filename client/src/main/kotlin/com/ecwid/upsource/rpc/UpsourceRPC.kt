package com.ecwid.upsource.rpc

import com.ecwid.upsource.transport.RpcResponse

/**
 * Main RPC service
 */
interface UpsourceRPC {

	/**
	 * Accepts the end user agreement for a given user
	 */
	fun acceptUserAgreement(request: VoidMessage): RpcResponse<VoidMessage>

	/**
	 * Returns the text of the end user agreement
	 */
	fun getUserAgreementText(request: VoidMessage): RpcResponse<com.ecwid.upsource.rpc.misc.UserAgreementTextDTO>

	/**
	 * In the case of an empty request, returns the list of all short project infos. Otherwise returns the list of project infos for a given set of project IDs. In any case only the projects the user has access to are returned.
	 */
	fun getAllProjects(request: ProjectIdListDTO): RpcResponse<com.ecwid.upsource.rpc.projects.ShortProjectInfoListDTO>

	/**
	 * Returns the list of projects  matching a given search criteria
	 */
	fun findProjects(request: com.ecwid.upsource.rpc.projects.FindProjectsRequestDTO): RpcResponse<com.ecwid.upsource.rpc.projects.ShortProjectInfoListDTO>

	/**
	 * Returns basic information about the project - name, project model, latest revision, etc.
	 */
	fun getProjectInfo(request: ProjectIdDTO): RpcResponse<com.ecwid.upsource.rpc.projects.ProjectInfoDTO>

	/**
	 * Returns VCS repository URL(s) for a given project
	 */
	fun getProjectVcsLinks(request: ProjectIdDTO): RpcResponse<com.ecwid.upsource.rpc.projects.VcsRepoListDTO>

	/**
	 * Returns README (README.md) contents from the latest revision
	 */
	fun getProjectReadme(request: ProjectIdDTO): RpcResponse<com.ecwid.upsource.rpc.projects.ProjectReadmeResponseDTO>

	/**
	 * Returns all registered code review patterns across all projects
	 */
	fun getCodeReviewPatterns(request: VoidMessage): RpcResponse<com.ecwid.upsource.rpc.projects.CodeReviewPatternsDTO>

	/**
	 * Returns the revision descriptor for the latest revision - ID, date, commit message, authors, parent revisions, etc.
	 */
	fun getHeadRevision(request: ProjectIdDTO): RpcResponse<com.ecwid.upsource.rpc.projects.RevisionInfoDTO>

	/**
	 * Returns the list of revisions in a given project (optionally with revision graph)
	 */
	fun getRevisionsList(request: com.ecwid.upsource.rpc.projects.RevisionsListRequestDTO): RpcResponse<com.ecwid.upsource.rpc.projects.RevisionDescriptorListDTO>

	/**
	 * Returns the list of revisions that match the given search query
	 */
	fun getRevisionsListFiltered(request: com.ecwid.upsource.rpc.projects.RevisionsListFilteredRequestDTO): RpcResponse<com.ecwid.upsource.rpc.projects.RevisionDescriptorListDTO>

	/**
	 * Returns the list of revisions across all projects authored by the specified user and (optionally) matching the specified query
	 */
	fun getUserRevisionsList(request: com.ecwid.upsource.rpc.projects.UserRevisionsListRequestDTO): RpcResponse<com.ecwid.upsource.rpc.projects.RevisionDescriptorListDTO>

	/**
	 * Returns the list of revisions since the given revision
	 */
	fun getRevisionsListUpdate(request: com.ecwid.upsource.rpc.projects.RevisionsListUpdateRequestDTO): RpcResponse<com.ecwid.upsource.rpc.projects.RevisionsListUpdateResponseDTO>

	/**
	 * Returns the revision descriptor - ID, date, commit message, authors, parent revisions, etc.
	 */
	fun getRevisionInfo(request: RevisionInProjectDTO): RpcResponse<com.ecwid.upsource.rpc.projects.RevisionInfoDTO>

	/**
	 * Returns the list of changes (files that were added, removed, or modified) in a revision
	 */
	fun getRevisionChanges(request: com.ecwid.upsource.rpc.projects.RevisionChangesRequestDTO): RpcResponse<com.ecwid.upsource.rpc.projects.RevisionsDiffDTO>

	/**
	 * Returns the list of branches a revision is part of
	 */
	fun getRevisionBranches(request: RevisionInProjectDTO): RpcResponse<com.ecwid.upsource.rpc.projects.RevisionBranchesResponseDTO>

	/**
	 * Returns the project structure tree starting from the given file
	 */
	fun getProjectSubtree(request: FileInRevisionDTO): RpcResponse<com.ecwid.upsource.rpc.projects.ProjectItemsListDTO>

	/**
	 * Returns meta information about a file (is deleted, is latest revision, etc.)
	 */
	fun getFileMeta(request: FileInRevisionDTO): RpcResponse<com.ecwid.upsource.rpc.projects.FileMetaResponseDTO>

	/**
	 * Returns the line-by-line file annotation
	 */
	fun getFileAnnotation(request: FileInRevisionDTO): RpcResponse<com.ecwid.upsource.rpc.projects.FileAnnotationResponseDTO>

	/**
	 * Returns the file contributors
	 */
	fun getFileContributors(request: FileInRevisionDTO): RpcResponse<com.ecwid.upsource.rpc.files.FileContributorsResponseDTO>

	/**
	 * Returns the authors of the given file fragment
	 */
	fun getFileFragmentAuthors(request: com.ecwid.upsource.rpc.projects.FileFragmentAuthorsRequestDTO): RpcResponse<com.ecwid.upsource.rpc.users.UsersListDTO>

	/**
	 * Returns the history (list of revision IDs and change types) of the file
	 */
	fun getFileHistory(request: com.ecwid.upsource.rpc.projects.FileHistoryRequestDTO): RpcResponse<com.ecwid.upsource.rpc.projects.FileHistoryResponseDTO>

	/**
	 * Returns the diff (changed lines and ranges) between the given revisions of a file
	 */
	fun getFileDiff(request: com.ecwid.upsource.rpc.projects.FileDiffRequestDTO): RpcResponse<com.ecwid.upsource.rpc.projects.FileDiffResponseDTO>

	/**
	 * Returns the inline diff (changed lines and ranges, line numbers mapping) for the given file
	 */
	fun getFileInlineDiff(request: com.ecwid.upsource.rpc.projects.FileDiffRequestDTO): RpcResponse<com.ecwid.upsource.rpc.projects.FileInlineDiffResponseDTO>

	/**
	 * Returns the inline diff of a file after the merge with the base branch
	 */
	fun getFileMergeInlineDiff(request: com.ecwid.upsource.rpc.projects.FileMergeInlineDiffRequestDTO): RpcResponse<com.ecwid.upsource.rpc.projects.FileInlineDiffResponseDTO>

	/**
	 * Returns the contents of the given file
	 */
	fun getFileContent(request: FileInRevisionDTO): RpcResponse<com.ecwid.upsource.rpc.files.FileContentResponseDTO>

	/**
	 * Returns the semantic markup of the given file
	 */
	fun getFilePsi(request: com.ecwid.upsource.rpc.files.FilePsiRequestDTO): RpcResponse<com.ecwid.upsource.rpc.files.FilePsiResponseDTO>

	/**
	 * Returns the text range of the given PSI element
	 */
	fun getStubNavigationRange(request: com.ecwid.upsource.rpc.findusages.StubIdDTO): RpcResponse<com.ecwid.upsource.rpc.findusages.NavigationTargetItemDTO>

	/**
	 * Returns the text representation of the given PSI element
	 */
	fun getElementDescription(request: com.ecwid.upsource.rpc.findusages.PsiElementIdDTO): RpcResponse<com.ecwid.upsource.rpc.findusages.TargetDescriptionDTO>

	/**
	 * Returns the documentation (e.g. Javadoc) for the given PSI element
	 */
	fun getElementDocumentation(request: com.ecwid.upsource.rpc.findusages.PsiElementIdDTO): RpcResponse<com.ecwid.upsource.rpc.findusages.ElementDocumentationDTO>

	/**
	 * Returns the list of usages for the given PSI element
	 */
	fun findUsages(request: com.ecwid.upsource.rpc.findusages.PsiElementIdDTO): RpcResponse<com.ecwid.upsource.rpc.findusages.FindUsagesResponseDTO>

	/**
	 * Returns the usages diff for the given PSI element between two revisions
	 */
	fun getUsagesDiff(request: com.ecwid.upsource.rpc.findusages.UsagesDiffRequestDTO): RpcResponse<com.ecwid.upsource.rpc.findusages.UsagesDiffResponseDTO>

	/**
	 * Returns the list of inheritors and ancestors for the given PSI element
	 */
	fun findHierarchy(request: com.ecwid.upsource.rpc.findusages.PsiElementIdDTO): RpcResponse<com.ecwid.upsource.rpc.findusages.FindHierarchyResultDTO>

	/**
	 * Returns the files matched by the search query in a given revision, review, project-wide, or service-wide
	 */
	fun gotoFileByName(request: com.ecwid.upsource.rpc.findusages.GotoFileRequestDTO): RpcResponse<com.ecwid.upsource.rpc.findusages.GotoFileResponseDTO>

	/**
	 * Performs full-text search across all commits and files (either service-wide or project-wide)
	 */
	fun textSearch(request: com.ecwid.upsource.rpc.findusages.TextSearchRequestDTO): RpcResponse<com.ecwid.upsource.rpc.findusages.TextSearchResponseDTO>

	/**
	 * Performs project-wide search by branch name
	 */
	fun findBranches(request: com.ecwid.upsource.rpc.findusages.FindBranchRequestDTO): RpcResponse<com.ecwid.upsource.rpc.findusages.FindBranchResponseDTO>

	/**
	 * Returns the list of changes in the given branch
	 */
	fun getBranchDiff(request: com.ecwid.upsource.rpc.projects.BranchRequestDTO): RpcResponse<com.ecwid.upsource.rpc.projects.RevisionsDiffDTO>

	/**
	 * Returns the list of changes between any two revisions
	 */
	fun getRevisionsDiff(request: com.ecwid.upsource.rpc.projects.RevisionsDiffRequestDTO): RpcResponse<com.ecwid.upsource.rpc.projects.RevisionsDiffDTO>

	/**
	 * Compare page
	 */
	fun getCompareInfo(request: com.ecwid.upsource.rpc.projects.CompareRequestDTO): RpcResponse<com.ecwid.upsource.rpc.projects.CompareInfoDTO>

	/**
	 * Revision graph for compare page
	 */
	fun getCompareGraph(request: com.ecwid.upsource.rpc.projects.RevisionsDiffRequestDTO): RpcResponse<com.ecwid.upsource.rpc.projects.CompareGraphDTO>

	/**
	 * Branch page
	 */
	fun getBranchInfo(request: com.ecwid.upsource.rpc.projects.BranchRequestDTO): RpcResponse<com.ecwid.upsource.rpc.projects.BranchInfoDTO>

	/**
	 * Revision graph for branch page
	 */
	fun getBranchGraph(request: com.ecwid.upsource.rpc.projects.BranchRequestDTO): RpcResponse<com.ecwid.upsource.rpc.projects.BranchGraphDTO>

	/**
	 * Returns the list of branches in a project
	 */
	fun getBranches(request: com.ecwid.upsource.rpc.projects.BranchesRequestDTO): RpcResponse<com.ecwid.upsource.rpc.projects.BranchListDTO>

	/**
	 * Finds commit(s) with the given commit hash
	 */
	fun findCommits(request: com.ecwid.upsource.rpc.projects.FindCommitsRequestDTO): RpcResponse<com.ecwid.upsource.rpc.projects.FindCommitsResponseDTO>

	/**
	 * Returns the discussions in the project, matching given query
	 */
	fun getProjectDiscussions(request: com.ecwid.upsource.rpc.projects.DiscussionsInProjectRequestDTO): RpcResponse<com.ecwid.upsource.rpc.projects.DiscussionsInProjectDTO>

	/**
	 * Returns the discussions in the given file
	 */
	fun getFileDiscussions(request: FileInRevisionDTO): RpcResponse<com.ecwid.upsource.rpc.projects.DiscussionsInFileDTO>

	/**
	 * Returns the discussions in the given revision
	 */
	fun getInlineDiscussionsInRevision(request: RevisionInProjectDTO): RpcResponse<com.ecwid.upsource.rpc.projects.DiscussionsInFilesDTO>

	/**
	 * Creates a new discussion
	 */
	fun createDiscussion(request: com.ecwid.upsource.rpc.projects.CreateDiscussionRequestDTO): RpcResponse<com.ecwid.upsource.rpc.projects.DiscussionInFileDTO>

	/**
	 * Updates a discussion
	 */
	fun resolveDiscussion(request: com.ecwid.upsource.rpc.projects.ResolveDiscussionRequestDTO): RpcResponse<VoidMessage>

	/**
	 * Checks if current user can resolve the given discussion
	 */
	fun getCurrentUserCanResolveDiscussion(request: com.ecwid.upsource.rpc.projects.DiscussionIdDTO): RpcResponse<VoidMessage>

	/**
	 * Adds a label to a discussion
	 */
	fun addDiscussionLabel(request: com.ecwid.upsource.rpc.projects.UpdateDiscussionLabelRequestDTO): RpcResponse<com.ecwid.upsource.rpc.projects.LabelDTO>

	/**
	 * Adds a label to a review
	 */
	fun addReviewLabel(request: com.ecwid.upsource.rpc.projects.UpdateReviewLabelRequestDTO): RpcResponse<com.ecwid.upsource.rpc.projects.UpdateReviewLabelResponseDTO>

	/**
	 * Removes a label from a discussion
	 */
	fun removeDiscussionLabel(request: com.ecwid.upsource.rpc.projects.UpdateDiscussionLabelRequestDTO): RpcResponse<VoidMessage>

	/**
	 * Removes a label from a review
	 */
	fun removeReviewLabel(request: com.ecwid.upsource.rpc.projects.UpdateReviewLabelRequestDTO): RpcResponse<com.ecwid.upsource.rpc.projects.UpdateReviewLabelResponseDTO>

	/**
	 * Stars a discussion
	 */
	fun starDiscussion(request: com.ecwid.upsource.rpc.projects.UpdateDiscussionFlagRequestDTO): RpcResponse<VoidMessage>

	/**
	 * Toggles the read/unread state of a discussion
	 */
	fun readDiscussion(request: com.ecwid.upsource.rpc.projects.UpdateDiscussionFlagRequestDTO): RpcResponse<VoidMessage>

	/**
	 * Adds a comment to the discussion
	 */
	fun addComment(request: com.ecwid.upsource.rpc.projects.AddCommentRequestDTO): RpcResponse<com.ecwid.upsource.rpc.projects.CommentDTO>

	/**
	 * Updates the comment
	 */
	fun updateComment(request: com.ecwid.upsource.rpc.projects.UpdateCommentRequestDTO): RpcResponse<com.ecwid.upsource.rpc.projects.UpdateCommentResponseDTO>

	/**
	 * Removes the comment
	 */
	fun removeComment(request: com.ecwid.upsource.rpc.projects.RemoveCommentRequestDTO): RpcResponse<com.ecwid.upsource.rpc.projects.RemoveCommentResponseDTO>

	/**
	 * Updates the task list embedded in a comment
	 */
	fun updateTaskList(request: com.ecwid.upsource.rpc.projects.UpdateTaskListRequestDTO): RpcResponse<com.ecwid.upsource.rpc.projects.UpdateCommentResponseDTO>

	/**
	 * Adds or removes a reaction to a specified target
	 */
	fun toggleReaction(request: com.ecwid.upsource.rpc.projects.ToggleReactionRequestDTO): RpcResponse<VoidMessage>

	/**
	 * Returns the news feed
	 */
	fun getFeed(request: com.ecwid.upsource.rpc.projects.FeedRequestDTO): RpcResponse<com.ecwid.upsource.rpc.projects.FeedDTO>

	/**
	 * Returns the discussions in the given revision
	 */
	fun getRevisionDiscussions(request: RevisionInProjectDTO): RpcResponse<com.ecwid.upsource.rpc.projects.DiscussionsInRevisionDTO>

	/**
	 * Returns short review information for a set of revisions
	 */
	fun getRevisionReviewInfo(request: com.ecwid.upsource.rpc.projects.RevisionListDTO): RpcResponse<com.ecwid.upsource.rpc.projects.RevisionReviewInfoListDTO>

	/**
	 * Returns review suggestions for a set of revisions
	 */
	fun getSuggestedReviewsForRevisions(request: com.ecwid.upsource.rpc.projects.RevisionListDTO): RpcResponse<com.ecwid.upsource.rpc.projects.SuggestedReviewListDTO>

	/**
	 * Returns review suggestion for the uncommitted revision
	 */
	fun getSuggestedReviewForGhosts(request: com.ecwid.upsource.rpc.projects.UncommittedRevisionDTO): RpcResponse<com.ecwid.upsource.rpc.projects.ReviewSuggestDTO>

	/**
	 * Returns discussion counters for a set of revisions
	 */
	fun getRevisionDiscussionCounters(request: com.ecwid.upsource.rpc.projects.RevisionDiscussionCountersRequestDTO): RpcResponse<com.ecwid.upsource.rpc.projects.RevisionDiscussionCountersListDTO>

	/**
	 * Returns build status for revisions
	 */
	fun getRevisionBuildStatus(request: com.ecwid.upsource.rpc.projects.RevisionListDTO): RpcResponse<com.ecwid.upsource.rpc.projects.RevisionBuildStatusListDTO>

	/**
	 * Returns the code ownership summary for given revisions
	 */
	fun getRevisionsOwnershipSummary(request: com.ecwid.upsource.rpc.projects.RevisionListDTO): RpcResponse<com.ecwid.upsource.rpc.projects.RevisionsOwnershipSummaryDTO>

	/**
	 * Returns the diff of external inspections compared to the previous run
	 */
	fun getRevisionsExternalInspectionsDiff(request: com.ecwid.upsource.rpc.projects.RevisionListDTO): RpcResponse<com.ecwid.upsource.rpc.projects.RevisionsExternalInspectionsDiffResponseDTO>

	/**
	 * Returns the suggested users to be mentioned in a comment
	 */
	fun getUsersForMention(request: com.ecwid.upsource.rpc.users.UsersForMentionRequestDTO): RpcResponse<com.ecwid.upsource.rpc.users.UsersListDTO>

	/**
	 * Returns the suggested reviewers for a given review
	 */
	fun getUsersForReview(request: com.ecwid.upsource.rpc.users.UsersForReviewRequestDTO): RpcResponse<com.ecwid.upsource.rpc.users.UsersForReviewDTO>

	/**
	 * Returns the list of non-empty user groups relevant to a given project
	 */
	fun getProjectUserGroups(request: com.ecwid.upsource.rpc.users.ProjectUserGroupsRequestDTO): RpcResponse<com.ecwid.upsource.rpc.users.UserGroupsListDTO>

	/**
	 * Returns the list of user groups by given IDs
	 */
	fun getUserGroupsByIds(request: com.ecwid.upsource.rpc.users.UserGroupsIdsListDTO): RpcResponse<com.ecwid.upsource.rpc.users.UserGroupsListDTO>

	/**
	 * Returns the list of users matching a given search criteria
	 */
	fun findUsers(request: com.ecwid.upsource.rpc.users.FindUsersRequestDTO): RpcResponse<com.ecwid.upsource.rpc.users.UserInfoResponseDTO>

	/**
	 * Returns the list of discussion labels
	 */
	fun getLabels(request: com.ecwid.upsource.rpc.projects.LabelsRequestDTO): RpcResponse<com.ecwid.upsource.rpc.projects.LabelsListDTO>

	/**
	 * Returns the list of review labels
	 */
	fun getReviewLabels(request: com.ecwid.upsource.rpc.projects.LabelsRequestDTO): RpcResponse<com.ecwid.upsource.rpc.projects.LabelsListDTO>

	/**
	 * Returns the list of reviews
	 */
	fun getReviews(request: com.ecwid.upsource.rpc.projects.ReviewsRequestDTO): RpcResponse<com.ecwid.upsource.rpc.projects.ReviewListDTO>

	/**
	 * Creates a review
	 */
	fun createReview(request: com.ecwid.upsource.rpc.projects.CreateReviewRequestDTO): RpcResponse<com.ecwid.upsource.rpc.projects.ReviewDescriptorDTO>

	/**
	 * Closes a review
	 */
	fun closeReview(request: com.ecwid.upsource.rpc.projects.CloseReviewRequestDTO): RpcResponse<com.ecwid.upsource.rpc.projects.CloseReviewResponseDTO>

	/**
	 * Renames a review
	 */
	fun renameReview(request: com.ecwid.upsource.rpc.projects.RenameReviewRequestDTO): RpcResponse<com.ecwid.upsource.rpc.projects.RenameReviewResponseDTO>

	/**
	 * Sets review description
	 */
	fun editReviewDescription(request: com.ecwid.upsource.rpc.projects.EditReviewDescriptionRequestDTO): RpcResponse<VoidMessage>

	/**
	 * Returns review details
	 */
	fun getReviewDetails(request: ReviewIdDTO): RpcResponse<com.ecwid.upsource.rpc.projects.ReviewDescriptorDTO>

	/**
	 * Returns the code ownership summary for a given review
	 */
	fun getReviewOwnershipSummary(request: ReviewIdDTO): RpcResponse<com.ecwid.upsource.rpc.projects.ReviewOwnershipSummaryDTO>

	/**
	 * Returns participants' progress in a given review
	 */
	fun getReviewProgress(request: ReviewIdDTO): RpcResponse<com.ecwid.upsource.rpc.projects.ReviewProgressDTO>

	/**
	 * Returns the diff of inspections between two revisions
	 */
	fun getReviewInspectionsDiff(request: com.ecwid.upsource.rpc.projects.ReviewInspectionsDiffRequestDTO): RpcResponse<com.ecwid.upsource.rpc.files.InspectionsDiffDTO>

	/**
	 * Attaches a revision to a review
	 */
	fun addRevisionToReview(request: com.ecwid.upsource.rpc.projects.RevisionsInReviewDTO): RpcResponse<VoidMessage>

	/**
	 * Initiates branch tracking for a given review
	 */
	fun startBranchTracking(request: com.ecwid.upsource.rpc.projects.StartBranchTrackingRequestDTO): RpcResponse<VoidMessage>

	/**
	 * Stops branch tracking for a given review
	 */
	fun stopBranchTracking(request: com.ecwid.upsource.rpc.projects.StopBranchTrackingRequestDTO): RpcResponse<VoidMessage>

	/**
	 * Rebase the review to a single squashed revision
	 */
	fun squashReviewRevisions(request: ReviewIdDTO): RpcResponse<VoidMessage>

	/**
	 * Removes a revision from a review
	 */
	fun removeRevisionFromReview(request: com.ecwid.upsource.rpc.projects.RevisionsInReviewDTO): RpcResponse<VoidMessage>

	/**
	 * Returns the list of revisions in a review
	 */
	fun getRevisionsInReview(request: ReviewIdDTO): RpcResponse<com.ecwid.upsource.rpc.projects.RevisionsInReviewResponseDTO>

	/**
	 * Returns the list of suggested revisions for a particular review
	 */
	fun getSuggestedRevisionsForReview(request: ReviewIdDTO): RpcResponse<com.ecwid.upsource.rpc.projects.SuggestedRevisionListDTO>

	/**
	 * Adds a participant (reviewer or watcher) to a review
	 */
	fun addParticipantToReview(request: com.ecwid.upsource.rpc.projects.ParticipantInReviewRequestDTO): RpcResponse<VoidMessage>

	/**
	 * Adds a group of participants (reviewers or watchers) to a review
	 */
	fun addGroupToReview(request: com.ecwid.upsource.rpc.projects.AddGroupToReviewRequestDTO): RpcResponse<com.ecwid.upsource.rpc.projects.AddGroupToReviewResponseDTO>

	/**
	 * Updates the participant's state
	 */
	fun updateParticipantInReview(request: com.ecwid.upsource.rpc.projects.UpdateParticipantInReviewRequestDTO): RpcResponse<com.ecwid.upsource.rpc.projects.UpdateParticipantInReviewResponseDTO>

	/**
	 * Removes a participant from a review
	 */
	fun removeParticipantFromReview(request: com.ecwid.upsource.rpc.projects.ParticipantInReviewRequestDTO): RpcResponse<VoidMessage>

	/**
	 * Mutes activities taking place in a certain review or cancels muting that was previously set
	 */
	fun toggleReviewMuted(request: com.ecwid.upsource.rpc.projects.ToggleReviewMutedRequestDTO): RpcResponse<VoidMessage>

	/**
	 * Sets/clears review due date
	 */
	fun setReviewDeadline(request: com.ecwid.upsource.rpc.projects.ReviewDeadlineRequestDTO): RpcResponse<VoidMessage>

	/**
	 * Merge review: sets target branch
	 */
	fun setReviewTargetBranch(request: com.ecwid.upsource.rpc.projects.ReviewTargetBranchDTO): RpcResponse<VoidMessage>

	/**
	 * Returns the list of changes (sum of all revisions) in a review
	 */
	fun getReviewSummaryChanges(request: com.ecwid.upsource.rpc.projects.ReviewSummaryChangesRequestDTO): RpcResponse<com.ecwid.upsource.rpc.projects.ReviewSummaryChangesResponseDTO>

	/**
	 * Returns the diff (sum of all revisions) of a file in review
	 */
	fun getFileInReviewSummaryInlineChanges(request: com.ecwid.upsource.rpc.projects.FileInReviewDiffRequestDTO): RpcResponse<com.ecwid.upsource.rpc.projects.FileInlineDiffResponseDTO>

	/**
	 * Returns the diff (sum of all revisions) of a file in review
	 */
	fun getFileInReviewSummaryDiff(request: com.ecwid.upsource.rpc.projects.FileInReviewDiffRequestDTO): RpcResponse<com.ecwid.upsource.rpc.projects.FileDiffResponseDTO>

	/**
	 * Track file read status
	 */
	fun setFileInReviewReadStatus(request: com.ecwid.upsource.rpc.projects.FileInReviewReadStatusRequestDTO): RpcResponse<VoidMessage>

	/**
	 * Returns the review discussions
	 */
	fun getReviewSummaryDiscussions(request: com.ecwid.upsource.rpc.projects.ReviewSummaryDiscussionsRequestDTO): RpcResponse<com.ecwid.upsource.rpc.projects.DiscussionsInFilesDTO>

	/**
	 * Removes the review
	 */
	fun removeReview(request: ReviewIdDTO): RpcResponse<VoidMessage>

	/**
	 * Returns matching revisions for stacktrace
	 */
	fun getMatchingRevisionsForStacktrace(request: com.ecwid.upsource.rpc.projects.StacktraceDTO): RpcResponse<com.ecwid.upsource.rpc.projects.MatchingRevisionsResponseDTO>

	/**
	 * Returns full paths and vcs commit ids for lines of stacktrace in context of revision
	 */
	fun getStacktraceInContextOfRevision(request: com.ecwid.upsource.rpc.projects.StacktraceDTO): RpcResponse<com.ecwid.upsource.rpc.projects.StacktracePositionsDTO>

	/**
	 * Returns the user info for a currently logged-in user
	 */
	fun getCurrentUser(request: VoidMessage): RpcResponse<com.ecwid.upsource.rpc.users.CurrentUserResponseDTO>

	/**
	 * Checks if current user can close given review
	 */
	fun getCurrentUserCanCloseReview(request: ReviewIdDTO): RpcResponse<VoidMessage>

	/**
	 * Checks if current user can delete given review
	 */
	fun getCurrentUserCanDeleteReview(request: ReviewIdDTO): RpcResponse<VoidMessage>

	/**
	 * Returns user info for given users
	 */
	fun getUserInfo(request: com.ecwid.upsource.rpc.users.UserInfoRequestDTO): RpcResponse<com.ecwid.upsource.rpc.users.UserInfoResponseDTO>

	/**
	 * Returns presence info for given users
	 */
	fun getUsersPresenceInfo(request: com.ecwid.upsource.rpc.users.UserInfoRequestDTO): RpcResponse<com.ecwid.upsource.rpc.users.UsersPresenceInfoResponseDTO>

	/**
	 * Maps a VCS username/email to a Hub account
	 */
	fun bindVcsUsername(request: com.ecwid.upsource.rpc.users.BindVcsUsernameRequestDTO): RpcResponse<VoidMessage>

	/**
	 * Returns the list of projects the specified user contributed to
	 */
	fun getUserProjects(request: com.ecwid.upsource.rpc.users.UserProjectsRequestDTO): RpcResponse<com.ecwid.upsource.rpc.users.UserProjectsResponseDTO>

	/**
	 * Sets or clears a user absence
	 */
	fun setUserAbsence(request: com.ecwid.upsource.rpc.users.UserAbsenceRequestDTO): RpcResponse<VoidMessage>

	/**
	 * Returns the value of a user setting by name
	 */
	fun getUserSetting(request: com.ecwid.upsource.rpc.misc.GetSettingRequestDTO): RpcResponse<com.ecwid.upsource.rpc.misc.GetSettingResponseDTO>

	/**
	 * Updates the value of a user setting by name
	 */
	fun setUserSetting(request: com.ecwid.upsource.rpc.misc.SetSettingRequestDTO): RpcResponse<VoidMessage>

	/**
	 * Returns the value of a cluster-wide setting by name
	 */
	fun getClusterSetting(request: com.ecwid.upsource.rpc.misc.GetSettingRequestDTO): RpcResponse<com.ecwid.upsource.rpc.misc.GetSettingResponseDTO>

	/**
	 * Updates the value of a cluster-wide setting by name
	 */
	fun setClusterSetting(request: com.ecwid.upsource.rpc.misc.SetSettingRequestDTO): RpcResponse<VoidMessage>

	/**
	 * Sets the server motto
	 */
	fun setMotto(request: com.ecwid.upsource.rpc.misc.SetMottoRequestDTO): RpcResponse<VoidMessage>

	/**
	 * Returns the value of a project setting by name
	 */
	fun getProjectSetting(request: com.ecwid.upsource.rpc.misc.GetProjectSettingRequestDTO): RpcResponse<com.ecwid.upsource.rpc.misc.GetSettingResponseDTO>

	/**
	 * Updates the value of a project setting by name
	 */
	fun setProjectSetting(request: com.ecwid.upsource.rpc.misc.SetProjectSettingRequestDTO): RpcResponse<VoidMessage>

	/**
	 * Updates the set of webhooks in a project
	 */
	fun setProjectWebhooks(request: com.ecwid.upsource.rpc.misc.SetProjectWebhooksRequestDTO): RpcResponse<VoidMessage>

	/**
	 * Creates a project
	 */
	fun createProject(request: com.ecwid.upsource.rpc.projects.CreateProjectRequestDTO): RpcResponse<VoidMessage>

	/**
	 * Loads project settings
	 */
	fun loadProject(request: ProjectIdDTO): RpcResponse<com.ecwid.upsource.rpc.projects.ProjectSettingsDTO>

	/**
	 * Updates project settings
	 */
	fun editProject(request: com.ecwid.upsource.rpc.projects.EditProjectRequestDTO): RpcResponse<VoidMessage>

	/**
	 * Deletes a project
	 */
	fun deleteProject(request: ProjectIdDTO): RpcResponse<VoidMessage>

	/**
	 * Completely reset a project
	 */
	fun resetProject(request: ProjectIdDTO): RpcResponse<VoidMessage>

	/**
	 * Loads project settings
	 */
	fun getProjectConfigurationParameters(request: VoidMessage): RpcResponse<com.ecwid.upsource.rpc.projects.ProjectConfigurationResponseDTO>

	/**
	 * Loads VCS Hosting services
	 */
	fun getVcsHostingServices(request: com.ecwid.upsource.rpc.projects.VcsHostingRequestDTO): RpcResponse<com.ecwid.upsource.rpc.projects.VcsHostingResponseDTO>

	/**
	 * Creates/updates a discussion label in a project
	 */
	fun createOrEditLabel(request: com.ecwid.upsource.rpc.projects.EditLabelRequestDTO): RpcResponse<com.ecwid.upsource.rpc.projects.LabelDTO>

	/**
	 * Creates/updates a review label in a project
	 */
	fun createOrEditReviewLabel(request: com.ecwid.upsource.rpc.projects.EditLabelRequestDTO): RpcResponse<com.ecwid.upsource.rpc.projects.LabelDTO>

	/**
	 * Hides predefined discussion labels in a project
	 */
	fun hidePredefinedLabels(request: com.ecwid.upsource.rpc.projects.HidePredefinedLabelsRequestDTO): RpcResponse<VoidMessage>

	/**
	 * Hides predefined review labels in a project
	 */
	fun hidePredefinedReviewLabels(request: com.ecwid.upsource.rpc.projects.HidePredefinedLabelsRequestDTO): RpcResponse<VoidMessage>

	/**
	 * Deletes a discussion label from a project
	 */
	fun deleteLabel(request: com.ecwid.upsource.rpc.projects.EditLabelRequestDTO): RpcResponse<VoidMessage>

	/**
	 * Deletes a review label from a project
	 */
	fun deleteReviewLabel(request: com.ecwid.upsource.rpc.projects.EditLabelRequestDTO): RpcResponse<VoidMessage>

	/**
	 * Merges two or more discussion labels into one
	 */
	fun mergeLabels(request: com.ecwid.upsource.rpc.projects.EditLabelsRequestDTO): RpcResponse<com.ecwid.upsource.rpc.projects.LabelDTO>

	/**
	 * Checks connection to a given VCS repository
	 */
	fun testVcsConnection(request: com.ecwid.upsource.rpc.projects.TestConnectionRequestDTO): RpcResponse<com.ecwid.upsource.rpc.projects.TestConnectionResponseDTO>

	/**
	 * Checks availability of a given POP3 mailbox
	 */
	fun testPOP3Mailbox(request: com.ecwid.upsource.rpc.misc.TestPOP3MailboxRequestDTO): RpcResponse<com.ecwid.upsource.rpc.misc.TestPOP3MailboxResponseDTO>

	/**
	 * Checks if server is in read-only mode
	 */
	fun getReadOnlyMode(request: VoidMessage): RpcResponse<com.ecwid.upsource.rpc.misc.ReadOnlyModeDTO>

	/**
	 * Enables/disables the read-only mode
	 */
	fun setReadOnlyMode(request: com.ecwid.upsource.rpc.misc.ReadOnlyModeDTO): RpcResponse<VoidMessage>

	/**
	 * undefined
	 */
	fun getEmailBounces(request: VoidMessage): RpcResponse<com.ecwid.upsource.rpc.misc.EmailBouncesResponseDTO>

	/**
	 * undefined
	 */
	fun resetEmailBounces(request: VoidMessage): RpcResponse<VoidMessage>

	/**
	 * Returns all roles available in Hub
	 */
	fun getAllRoles(request: VoidMessage): RpcResponse<com.ecwid.upsource.rpc.projects.AllRolesResponseDTO>

	/**
	 * Returns users that have any access to the project and role keys associated with each user
	 */
	fun getUsersRoles(request: com.ecwid.upsource.rpc.projects.UsersRolesRequestDTO): RpcResponse<com.ecwid.upsource.rpc.projects.UsersRolesResponseDTO>

	/**
	 * Adds a user role
	 */
	fun addUserRole(request: com.ecwid.upsource.rpc.projects.AddRoleRequestDTO): RpcResponse<VoidMessage>

	/**
	 * Deletes a user role (not the role itself, but the association)
	 */
	fun deleteUserRole(request: com.ecwid.upsource.rpc.projects.DeleteRoleRequestDTO): RpcResponse<VoidMessage>

	/**
	 * Searches for user in Hub by an email, and sends an invitation if not found
	 */
	fun inviteUser(request: com.ecwid.upsource.rpc.projects.InviteUserRequestDTO): RpcResponse<com.ecwid.upsource.rpc.projects.InviteUserResponseDTO>

	/**
	 * Exports user-generated data - reviews, discussions, settings
	 */
	fun exportData(request: VoidMessage): RpcResponse<com.ecwid.upsource.rpc.misc.ExportDataResponseDTO>

	/**
	 * Returns project activity distribution over time, i.e. the number of commits per time period
	 */
	fun getProjectActivity(request: com.ecwid.upsource.rpc.analytics.ProjectActivityRequestDTO): RpcResponse<com.ecwid.upsource.rpc.analytics.ProjectActivityDTO>

	/**
	 * Returns contributors distribution over time, i.e. the number of commits per time period per committer
	 */
	fun getContributorsDistribution(request: com.ecwid.upsource.rpc.analytics.ContributorsDistributionRequestDTO): RpcResponse<com.ecwid.upsource.rpc.analytics.ContributorsDistributionDTO>

	/**
	 * Returns commits distribution in a given date range over all committers and modules
	 */
	fun getResponsibilityDistribution(request: com.ecwid.upsource.rpc.analytics.ResponsibilityDistributionRequestDTO): RpcResponse<com.ecwid.upsource.rpc.analytics.ResponsibilityDistributionDTO>

	/**
	 * Returns all committers throughout the project history
	 */
	fun getProjectCommitters(request: ProjectIdDTO): RpcResponse<com.ecwid.upsource.rpc.analytics.ProjectCommittersDTO>

	/**
	 * Returns project activity distribution over time, i.e. the number of commits per time period for a specified set of committers
	 */
	fun getUserActivity(request: com.ecwid.upsource.rpc.analytics.UserActivityRequestDTO): RpcResponse<com.ecwid.upsource.rpc.analytics.UserActivityDTO>

	/**
	 * Returns per-module activity distribution in the project
	 */
	fun getModulesDistribution(request: com.ecwid.upsource.rpc.analytics.ModulesDistributionRequestDTO): RpcResponse<com.ecwid.upsource.rpc.analytics.ModulesDistributionDTO>

	/**
	 * Returns the summary for the specified date range and set of committers: total number of commits, number of commits that aren't part of any module, total number of modules changed
	 */
	fun getCommitsSummary(request: com.ecwid.upsource.rpc.analytics.CommitsSummaryRequestDTO): RpcResponse<com.ecwid.upsource.rpc.analytics.CommitsSummaryDTO>

	/**
	 * Returns the revisions in the specified module, in the specified date range and for the specified committers
	 */
	fun getCommitsDetails(request: com.ecwid.upsource.rpc.analytics.CommitsDetailsRequestDTO): RpcResponse<com.ecwid.upsource.rpc.analytics.CommitsDetailsDTO>

	/**
	 * Returns the data required to display an animated chart of distribution of individual files in project across "edits - age" plane
	 */
	fun getFileHistoryChart(request: com.ecwid.upsource.rpc.analytics.FileHistoryChartRequestDTO): RpcResponse<com.ecwid.upsource.rpc.analytics.FileHistoryChartDTO>

	/**
	 * Returns the list of files in a project and their content sizes required to build the interactive treemap chart
	 */
	fun getProjectTreeMap(request: com.ecwid.upsource.rpc.analytics.ProjectTreeMapRequestDTO): RpcResponse<com.ecwid.upsource.rpc.analytics.ProjectTreeMapDTO>

	/**
	 * Returns the activity pulse for a specified project
	 */
	fun getProjectPulse(request: com.ecwid.upsource.rpc.analytics.ProjectPulseRequestDTO): RpcResponse<com.ecwid.upsource.rpc.analytics.PulseResponseDTO>

	/**
	 * Returns the activity pulse of a given user across all projects (`allValues` time series is always empty)
	 */
	fun getUserPulse(request: com.ecwid.upsource.rpc.analytics.UserPulseRequestDTO): RpcResponse<com.ecwid.upsource.rpc.analytics.PulseResponseDTO>

	/**
	 * Returns the general review statistics in the project
	 */
	fun getReviewStatistics(request: com.ecwid.upsource.rpc.analytics.ReviewStatisticsRequestDTO): RpcResponse<com.ecwid.upsource.rpc.analytics.ReviewStatisticsDTO>

	/**
	 * Returns the number of revisions covered by reviews in the project
	 */
	fun getReviewCoverage(request: com.ecwid.upsource.rpc.analytics.ReviewCoverageRequestDTO): RpcResponse<com.ecwid.upsource.rpc.analytics.ReviewCoverageDTO>

	/**
	 * Returns the time distribution of reviews and review iterations
	 */
	fun getReviewTimeStatistics(request: com.ecwid.upsource.rpc.analytics.ReviewTimeStatisticsRequestDTO): RpcResponse<com.ecwid.upsource.rpc.analytics.ReviewTimeStatisticsDTO>

	/**
	 * Returns review activity graph for the project
	 */
	fun getReviewersGraph(request: com.ecwid.upsource.rpc.analytics.ReviewersGraphRequestDTO): RpcResponse<com.ecwid.upsource.rpc.analytics.ReviewersGraphDTO>

	/**
	 * Updates user timezone
	 */
	fun updateUserTimezone(request: com.ecwid.upsource.rpc.misc.UpdateUserTimezoneDTO): RpcResponse<VoidMessage>

	/**
	 * Updates the time when the user last saw the list of his/her achievements
	 */
	fun updateAchievementsLastSeen(request: com.ecwid.upsource.rpc.misc.UserActionNotificationDTO): RpcResponse<VoidMessage>

	/**
	 * Returns the list of achievements the user has unlocked
	 */
	fun getUnlockedUserAchievements(request: com.ecwid.upsource.rpc.misc.UserAchievementsRequestDTO): RpcResponse<com.ecwid.upsource.rpc.misc.AchievementsListDTO>

	/**
	 * Returns a count of unread achievements the user has unlocked
	 */
	fun getUnreadUnlockedUserAchievementsCount(request: VoidMessage): RpcResponse<com.ecwid.upsource.rpc.misc.UserAchievementsCountDTO>

	/**
	 * Returns the list of all achievements with information about whether the achievement was unlocked by the user or not
	 */
	fun getUserAchievements(request: com.ecwid.upsource.rpc.misc.UserAchievementsRequestDTO): RpcResponse<com.ecwid.upsource.rpc.misc.AchievementsListDTO>

	/**
	 * Returns the list of available issue trackers
	 */
	fun getAvailableIssueTrackerProviders(request: VoidMessage): RpcResponse<com.ecwid.upsource.rpc.issuetrackers.IssueTrackerProvidersListDTO>

	/**
	 * Returns detailed issue information
	 */
	fun getIssueInfo(request: com.ecwid.upsource.rpc.issuetrackers.IssueInfoRequestDTO): RpcResponse<com.ecwid.upsource.rpc.issuetrackers.IssueInfoDTO>

	/**
	 * Creates an issue from the discussion in a given issue tracker
	 */
	fun createIssueFromDiscussion(request: com.ecwid.upsource.rpc.issuetrackers.CreateIssueFromDiscussionRequestDTO): RpcResponse<com.ecwid.upsource.rpc.issuetrackers.IssueIdDTO>

	/**
	 * Creates an issue from the review in a given issue tracker
	 */
	fun createIssueFromReview(request: com.ecwid.upsource.rpc.issuetrackers.CreateIssueFromReviewRequestDTO): RpcResponse<com.ecwid.upsource.rpc.issuetrackers.IssueIdDTO>
}
