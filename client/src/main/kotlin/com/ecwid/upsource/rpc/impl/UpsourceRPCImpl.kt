package com.ecwid.upsource.rpc.impl

import com.ecwid.upsource.rpc.UpsourceRPC
import com.ecwid.upsource.serializer.Serializer
import com.ecwid.upsource.transport.RpcResponse
import com.ecwid.upsource.transport.RpcTransport

/**
 * Main RPC service implementation
 */
internal class UpsourceRPCImpl(
	private val transport: RpcTransport,
	private val serializer: Serializer
) : UpsourceRPC {

	override fun acceptUserAgreement(request: com.ecwid.upsource.rpc.VoidMessage): RpcResponse<com.ecwid.upsource.rpc.VoidMessage> {
		val body = serializer.serialize(request)
		val transportResponse = transport.makeRequest("acceptUserAgreement", body)
		val clazz = com.ecwid.upsource.rpc.VoidMessage::class.java
		return serializer.deserialize(transportResponse, clazz)
	}

	override fun getUserAgreementText(request: com.ecwid.upsource.rpc.VoidMessage): RpcResponse<com.ecwid.upsource.rpc.misc.UserAgreementTextDTO> {
		val body = serializer.serialize(request)
		val transportResponse = transport.makeRequest("getUserAgreementText", body)
		val clazz = com.ecwid.upsource.rpc.misc.UserAgreementTextDTO::class.java
		return serializer.deserialize(transportResponse, clazz)
	}

	override fun getAllProjects(request: com.ecwid.upsource.rpc.ProjectIdListDTO): RpcResponse<com.ecwid.upsource.rpc.projects.ShortProjectInfoListDTO> {
		val body = serializer.serialize(request)
		val transportResponse = transport.makeRequest("getAllProjects", body)
		val clazz = com.ecwid.upsource.rpc.projects.ShortProjectInfoListDTO::class.java
		return serializer.deserialize(transportResponse, clazz)
	}

	override fun findProjects(request: com.ecwid.upsource.rpc.projects.FindProjectsRequestDTO): RpcResponse<com.ecwid.upsource.rpc.projects.ShortProjectInfoListDTO> {
		val body = serializer.serialize(request)
		val transportResponse = transport.makeRequest("findProjects", body)
		val clazz = com.ecwid.upsource.rpc.projects.ShortProjectInfoListDTO::class.java
		return serializer.deserialize(transportResponse, clazz)
	}

	override fun getProjectInfo(request: com.ecwid.upsource.rpc.ProjectIdDTO): RpcResponse<com.ecwid.upsource.rpc.projects.ProjectInfoDTO> {
		val body = serializer.serialize(request)
		val transportResponse = transport.makeRequest("getProjectInfo", body)
		val clazz = com.ecwid.upsource.rpc.projects.ProjectInfoDTO::class.java
		return serializer.deserialize(transportResponse, clazz)
	}

	override fun getProjectVcsLinks(request: com.ecwid.upsource.rpc.ProjectIdDTO): RpcResponse<com.ecwid.upsource.rpc.projects.VcsRepoListDTO> {
		val body = serializer.serialize(request)
		val transportResponse = transport.makeRequest("getProjectVcsLinks", body)
		val clazz = com.ecwid.upsource.rpc.projects.VcsRepoListDTO::class.java
		return serializer.deserialize(transportResponse, clazz)
	}

	override fun getProjectReadme(request: com.ecwid.upsource.rpc.ProjectIdDTO): RpcResponse<com.ecwid.upsource.rpc.projects.ProjectReadmeResponseDTO> {
		val body = serializer.serialize(request)
		val transportResponse = transport.makeRequest("getProjectReadme", body)
		val clazz = com.ecwid.upsource.rpc.projects.ProjectReadmeResponseDTO::class.java
		return serializer.deserialize(transportResponse, clazz)
	}

	override fun getCodeReviewPatterns(request: com.ecwid.upsource.rpc.VoidMessage): RpcResponse<com.ecwid.upsource.rpc.projects.CodeReviewPatternsDTO> {
		val body = serializer.serialize(request)
		val transportResponse = transport.makeRequest("getCodeReviewPatterns", body)
		val clazz = com.ecwid.upsource.rpc.projects.CodeReviewPatternsDTO::class.java
		return serializer.deserialize(transportResponse, clazz)
	}

	override fun getHeadRevision(request: com.ecwid.upsource.rpc.ProjectIdDTO): RpcResponse<com.ecwid.upsource.rpc.projects.RevisionInfoDTO> {
		val body = serializer.serialize(request)
		val transportResponse = transport.makeRequest("getHeadRevision", body)
		val clazz = com.ecwid.upsource.rpc.projects.RevisionInfoDTO::class.java
		return serializer.deserialize(transportResponse, clazz)
	}

	override fun getRevisionsList(request: com.ecwid.upsource.rpc.projects.RevisionsListRequestDTO): RpcResponse<com.ecwid.upsource.rpc.projects.RevisionDescriptorListDTO> {
		val body = serializer.serialize(request)
		val transportResponse = transport.makeRequest("getRevisionsList", body)
		val clazz = com.ecwid.upsource.rpc.projects.RevisionDescriptorListDTO::class.java
		return serializer.deserialize(transportResponse, clazz)
	}

	override fun getRevisionsListFiltered(request: com.ecwid.upsource.rpc.projects.RevisionsListFilteredRequestDTO): RpcResponse<com.ecwid.upsource.rpc.projects.RevisionDescriptorListDTO> {
		val body = serializer.serialize(request)
		val transportResponse = transport.makeRequest("getRevisionsListFiltered", body)
		val clazz = com.ecwid.upsource.rpc.projects.RevisionDescriptorListDTO::class.java
		return serializer.deserialize(transportResponse, clazz)
	}

	override fun getUserRevisionsList(request: com.ecwid.upsource.rpc.projects.UserRevisionsListRequestDTO): RpcResponse<com.ecwid.upsource.rpc.projects.RevisionDescriptorListDTO> {
		val body = serializer.serialize(request)
		val transportResponse = transport.makeRequest("getUserRevisionsList", body)
		val clazz = com.ecwid.upsource.rpc.projects.RevisionDescriptorListDTO::class.java
		return serializer.deserialize(transportResponse, clazz)
	}

	override fun getRevisionsListUpdate(request: com.ecwid.upsource.rpc.projects.RevisionsListUpdateRequestDTO): RpcResponse<com.ecwid.upsource.rpc.projects.RevisionsListUpdateResponseDTO> {
		val body = serializer.serialize(request)
		val transportResponse = transport.makeRequest("getRevisionsListUpdate", body)
		val clazz = com.ecwid.upsource.rpc.projects.RevisionsListUpdateResponseDTO::class.java
		return serializer.deserialize(transportResponse, clazz)
	}

	override fun getRevisionInfo(request: com.ecwid.upsource.rpc.RevisionInProjectDTO): RpcResponse<com.ecwid.upsource.rpc.projects.RevisionInfoDTO> {
		val body = serializer.serialize(request)
		val transportResponse = transport.makeRequest("getRevisionInfo", body)
		val clazz = com.ecwid.upsource.rpc.projects.RevisionInfoDTO::class.java
		return serializer.deserialize(transportResponse, clazz)
	}

	override fun getRevisionChanges(request: com.ecwid.upsource.rpc.projects.RevisionChangesRequestDTO): RpcResponse<com.ecwid.upsource.rpc.projects.RevisionsDiffDTO> {
		val body = serializer.serialize(request)
		val transportResponse = transport.makeRequest("getRevisionChanges", body)
		val clazz = com.ecwid.upsource.rpc.projects.RevisionsDiffDTO::class.java
		return serializer.deserialize(transportResponse, clazz)
	}

	override fun getRevisionBranches(request: com.ecwid.upsource.rpc.RevisionInProjectDTO): RpcResponse<com.ecwid.upsource.rpc.projects.RevisionBranchesResponseDTO> {
		val body = serializer.serialize(request)
		val transportResponse = transport.makeRequest("getRevisionBranches", body)
		val clazz = com.ecwid.upsource.rpc.projects.RevisionBranchesResponseDTO::class.java
		return serializer.deserialize(transportResponse, clazz)
	}

	override fun getProjectSubtree(request: com.ecwid.upsource.rpc.FileInRevisionDTO): RpcResponse<com.ecwid.upsource.rpc.projects.ProjectItemsListDTO> {
		val body = serializer.serialize(request)
		val transportResponse = transport.makeRequest("getProjectSubtree", body)
		val clazz = com.ecwid.upsource.rpc.projects.ProjectItemsListDTO::class.java
		return serializer.deserialize(transportResponse, clazz)
	}

	override fun getFileMeta(request: com.ecwid.upsource.rpc.FileInRevisionDTO): RpcResponse<com.ecwid.upsource.rpc.projects.FileMetaResponseDTO> {
		val body = serializer.serialize(request)
		val transportResponse = transport.makeRequest("getFileMeta", body)
		val clazz = com.ecwid.upsource.rpc.projects.FileMetaResponseDTO::class.java
		return serializer.deserialize(transportResponse, clazz)
	}

	override fun getFileAnnotation(request: com.ecwid.upsource.rpc.FileInRevisionDTO): RpcResponse<com.ecwid.upsource.rpc.projects.FileAnnotationResponseDTO> {
		val body = serializer.serialize(request)
		val transportResponse = transport.makeRequest("getFileAnnotation", body)
		val clazz = com.ecwid.upsource.rpc.projects.FileAnnotationResponseDTO::class.java
		return serializer.deserialize(transportResponse, clazz)
	}

	override fun getFileContributors(request: com.ecwid.upsource.rpc.FileInRevisionDTO): RpcResponse<com.ecwid.upsource.rpc.files.FileContributorsResponseDTO> {
		val body = serializer.serialize(request)
		val transportResponse = transport.makeRequest("getFileContributors", body)
		val clazz = com.ecwid.upsource.rpc.files.FileContributorsResponseDTO::class.java
		return serializer.deserialize(transportResponse, clazz)
	}

	override fun getFileFragmentAuthors(request: com.ecwid.upsource.rpc.projects.FileFragmentAuthorsRequestDTO): RpcResponse<com.ecwid.upsource.rpc.users.UsersListDTO> {
		val body = serializer.serialize(request)
		val transportResponse = transport.makeRequest("getFileFragmentAuthors", body)
		val clazz = com.ecwid.upsource.rpc.users.UsersListDTO::class.java
		return serializer.deserialize(transportResponse, clazz)
	}

	override fun getFileHistory(request: com.ecwid.upsource.rpc.projects.FileHistoryRequestDTO): RpcResponse<com.ecwid.upsource.rpc.projects.FileHistoryResponseDTO> {
		val body = serializer.serialize(request)
		val transportResponse = transport.makeRequest("getFileHistory", body)
		val clazz = com.ecwid.upsource.rpc.projects.FileHistoryResponseDTO::class.java
		return serializer.deserialize(transportResponse, clazz)
	}

	override fun getFileDiff(request: com.ecwid.upsource.rpc.projects.FileDiffRequestDTO): RpcResponse<com.ecwid.upsource.rpc.projects.FileDiffResponseDTO> {
		val body = serializer.serialize(request)
		val transportResponse = transport.makeRequest("getFileDiff", body)
		val clazz = com.ecwid.upsource.rpc.projects.FileDiffResponseDTO::class.java
		return serializer.deserialize(transportResponse, clazz)
	}

	override fun getFileInlineDiff(request: com.ecwid.upsource.rpc.projects.FileDiffRequestDTO): RpcResponse<com.ecwid.upsource.rpc.projects.FileInlineDiffResponseDTO> {
		val body = serializer.serialize(request)
		val transportResponse = transport.makeRequest("getFileInlineDiff", body)
		val clazz = com.ecwid.upsource.rpc.projects.FileInlineDiffResponseDTO::class.java
		return serializer.deserialize(transportResponse, clazz)
	}

	override fun getFileMergeInlineDiff(request: com.ecwid.upsource.rpc.projects.FileMergeInlineDiffRequestDTO): RpcResponse<com.ecwid.upsource.rpc.projects.FileInlineDiffResponseDTO> {
		val body = serializer.serialize(request)
		val transportResponse = transport.makeRequest("getFileMergeInlineDiff", body)
		val clazz = com.ecwid.upsource.rpc.projects.FileInlineDiffResponseDTO::class.java
		return serializer.deserialize(transportResponse, clazz)
	}

	override fun getFileContent(request: com.ecwid.upsource.rpc.FileInRevisionDTO): RpcResponse<com.ecwid.upsource.rpc.files.FileContentResponseDTO> {
		val body = serializer.serialize(request)
		val transportResponse = transport.makeRequest("getFileContent", body)
		val clazz = com.ecwid.upsource.rpc.files.FileContentResponseDTO::class.java
		return serializer.deserialize(transportResponse, clazz)
	}

	override fun getFilePsi(request: com.ecwid.upsource.rpc.files.FilePsiRequestDTO): RpcResponse<com.ecwid.upsource.rpc.files.FilePsiResponseDTO> {
		val body = serializer.serialize(request)
		val transportResponse = transport.makeRequest("getFilePsi", body)
		val clazz = com.ecwid.upsource.rpc.files.FilePsiResponseDTO::class.java
		return serializer.deserialize(transportResponse, clazz)
	}

	override fun getStubNavigationRange(request: com.ecwid.upsource.rpc.findusages.StubIdDTO): RpcResponse<com.ecwid.upsource.rpc.findusages.NavigationTargetItemDTO> {
		val body = serializer.serialize(request)
		val transportResponse = transport.makeRequest("getStubNavigationRange", body)
		val clazz = com.ecwid.upsource.rpc.findusages.NavigationTargetItemDTO::class.java
		return serializer.deserialize(transportResponse, clazz)
	}

	override fun getElementDescription(request: com.ecwid.upsource.rpc.findusages.PsiElementIdDTO): RpcResponse<com.ecwid.upsource.rpc.findusages.TargetDescriptionDTO> {
		val body = serializer.serialize(request)
		val transportResponse = transport.makeRequest("getElementDescription", body)
		val clazz = com.ecwid.upsource.rpc.findusages.TargetDescriptionDTO::class.java
		return serializer.deserialize(transportResponse, clazz)
	}

	override fun getElementDocumentation(request: com.ecwid.upsource.rpc.findusages.PsiElementIdDTO): RpcResponse<com.ecwid.upsource.rpc.findusages.ElementDocumentationDTO> {
		val body = serializer.serialize(request)
		val transportResponse = transport.makeRequest("getElementDocumentation", body)
		val clazz = com.ecwid.upsource.rpc.findusages.ElementDocumentationDTO::class.java
		return serializer.deserialize(transportResponse, clazz)
	}

	override fun findUsages(request: com.ecwid.upsource.rpc.findusages.PsiElementIdDTO): RpcResponse<com.ecwid.upsource.rpc.findusages.FindUsagesResponseDTO> {
		val body = serializer.serialize(request)
		val transportResponse = transport.makeRequest("findUsages", body)
		val clazz = com.ecwid.upsource.rpc.findusages.FindUsagesResponseDTO::class.java
		return serializer.deserialize(transportResponse, clazz)
	}

	override fun getUsagesDiff(request: com.ecwid.upsource.rpc.findusages.UsagesDiffRequestDTO): RpcResponse<com.ecwid.upsource.rpc.findusages.UsagesDiffResponseDTO> {
		val body = serializer.serialize(request)
		val transportResponse = transport.makeRequest("getUsagesDiff", body)
		val clazz = com.ecwid.upsource.rpc.findusages.UsagesDiffResponseDTO::class.java
		return serializer.deserialize(transportResponse, clazz)
	}

	override fun findHierarchy(request: com.ecwid.upsource.rpc.findusages.PsiElementIdDTO): RpcResponse<com.ecwid.upsource.rpc.findusages.FindHierarchyResultDTO> {
		val body = serializer.serialize(request)
		val transportResponse = transport.makeRequest("findHierarchy", body)
		val clazz = com.ecwid.upsource.rpc.findusages.FindHierarchyResultDTO::class.java
		return serializer.deserialize(transportResponse, clazz)
	}

	override fun gotoFileByName(request: com.ecwid.upsource.rpc.findusages.GotoFileRequestDTO): RpcResponse<com.ecwid.upsource.rpc.findusages.GotoFileResponseDTO> {
		val body = serializer.serialize(request)
		val transportResponse = transport.makeRequest("gotoFileByName", body)
		val clazz = com.ecwid.upsource.rpc.findusages.GotoFileResponseDTO::class.java
		return serializer.deserialize(transportResponse, clazz)
	}

	override fun textSearch(request: com.ecwid.upsource.rpc.findusages.TextSearchRequestDTO): RpcResponse<com.ecwid.upsource.rpc.findusages.TextSearchResponseDTO> {
		val body = serializer.serialize(request)
		val transportResponse = transport.makeRequest("textSearch", body)
		val clazz = com.ecwid.upsource.rpc.findusages.TextSearchResponseDTO::class.java
		return serializer.deserialize(transportResponse, clazz)
	}

	override fun findBranches(request: com.ecwid.upsource.rpc.findusages.FindBranchRequestDTO): RpcResponse<com.ecwid.upsource.rpc.findusages.FindBranchResponseDTO> {
		val body = serializer.serialize(request)
		val transportResponse = transport.makeRequest("findBranches", body)
		val clazz = com.ecwid.upsource.rpc.findusages.FindBranchResponseDTO::class.java
		return serializer.deserialize(transportResponse, clazz)
	}

	override fun getBranchDiff(request: com.ecwid.upsource.rpc.projects.BranchRequestDTO): RpcResponse<com.ecwid.upsource.rpc.projects.RevisionsDiffDTO> {
		val body = serializer.serialize(request)
		val transportResponse = transport.makeRequest("getBranchDiff", body)
		val clazz = com.ecwid.upsource.rpc.projects.RevisionsDiffDTO::class.java
		return serializer.deserialize(transportResponse, clazz)
	}

	override fun getRevisionsDiff(request: com.ecwid.upsource.rpc.projects.RevisionsDiffRequestDTO): RpcResponse<com.ecwid.upsource.rpc.projects.RevisionsDiffDTO> {
		val body = serializer.serialize(request)
		val transportResponse = transport.makeRequest("getRevisionsDiff", body)
		val clazz = com.ecwid.upsource.rpc.projects.RevisionsDiffDTO::class.java
		return serializer.deserialize(transportResponse, clazz)
	}

	override fun getCompareInfo(request: com.ecwid.upsource.rpc.projects.CompareRequestDTO): RpcResponse<com.ecwid.upsource.rpc.projects.CompareInfoDTO> {
		val body = serializer.serialize(request)
		val transportResponse = transport.makeRequest("getCompareInfo", body)
		val clazz = com.ecwid.upsource.rpc.projects.CompareInfoDTO::class.java
		return serializer.deserialize(transportResponse, clazz)
	}

	override fun getCompareGraph(request: com.ecwid.upsource.rpc.projects.RevisionsDiffRequestDTO): RpcResponse<com.ecwid.upsource.rpc.projects.CompareGraphDTO> {
		val body = serializer.serialize(request)
		val transportResponse = transport.makeRequest("getCompareGraph", body)
		val clazz = com.ecwid.upsource.rpc.projects.CompareGraphDTO::class.java
		return serializer.deserialize(transportResponse, clazz)
	}

	override fun getBranchInfo(request: com.ecwid.upsource.rpc.projects.BranchRequestDTO): RpcResponse<com.ecwid.upsource.rpc.projects.BranchInfoDTO> {
		val body = serializer.serialize(request)
		val transportResponse = transport.makeRequest("getBranchInfo", body)
		val clazz = com.ecwid.upsource.rpc.projects.BranchInfoDTO::class.java
		return serializer.deserialize(transportResponse, clazz)
	}

	override fun getBranchGraph(request: com.ecwid.upsource.rpc.projects.BranchRequestDTO): RpcResponse<com.ecwid.upsource.rpc.projects.BranchGraphDTO> {
		val body = serializer.serialize(request)
		val transportResponse = transport.makeRequest("getBranchGraph", body)
		val clazz = com.ecwid.upsource.rpc.projects.BranchGraphDTO::class.java
		return serializer.deserialize(transportResponse, clazz)
	}

	override fun getBranches(request: com.ecwid.upsource.rpc.projects.BranchesRequestDTO): RpcResponse<com.ecwid.upsource.rpc.projects.BranchListDTO> {
		val body = serializer.serialize(request)
		val transportResponse = transport.makeRequest("getBranches", body)
		val clazz = com.ecwid.upsource.rpc.projects.BranchListDTO::class.java
		return serializer.deserialize(transportResponse, clazz)
	}

	override fun findCommits(request: com.ecwid.upsource.rpc.projects.FindCommitsRequestDTO): RpcResponse<com.ecwid.upsource.rpc.projects.FindCommitsResponseDTO> {
		val body = serializer.serialize(request)
		val transportResponse = transport.makeRequest("findCommits", body)
		val clazz = com.ecwid.upsource.rpc.projects.FindCommitsResponseDTO::class.java
		return serializer.deserialize(transportResponse, clazz)
	}

	override fun getProjectDiscussions(request: com.ecwid.upsource.rpc.projects.DiscussionsInProjectRequestDTO): RpcResponse<com.ecwid.upsource.rpc.projects.DiscussionsInProjectDTO> {
		val body = serializer.serialize(request)
		val transportResponse = transport.makeRequest("getProjectDiscussions", body)
		val clazz = com.ecwid.upsource.rpc.projects.DiscussionsInProjectDTO::class.java
		return serializer.deserialize(transportResponse, clazz)
	}

	override fun getFileDiscussions(request: com.ecwid.upsource.rpc.FileInRevisionDTO): RpcResponse<com.ecwid.upsource.rpc.projects.DiscussionsInFileDTO> {
		val body = serializer.serialize(request)
		val transportResponse = transport.makeRequest("getFileDiscussions", body)
		val clazz = com.ecwid.upsource.rpc.projects.DiscussionsInFileDTO::class.java
		return serializer.deserialize(transportResponse, clazz)
	}

	override fun getInlineDiscussionsInRevision(request: com.ecwid.upsource.rpc.RevisionInProjectDTO): RpcResponse<com.ecwid.upsource.rpc.projects.DiscussionsInFilesDTO> {
		val body = serializer.serialize(request)
		val transportResponse = transport.makeRequest("getInlineDiscussionsInRevision", body)
		val clazz = com.ecwid.upsource.rpc.projects.DiscussionsInFilesDTO::class.java
		return serializer.deserialize(transportResponse, clazz)
	}

	override fun createDiscussion(request: com.ecwid.upsource.rpc.projects.CreateDiscussionRequestDTO): RpcResponse<com.ecwid.upsource.rpc.projects.DiscussionInFileDTO> {
		val body = serializer.serialize(request)
		val transportResponse = transport.makeRequest("createDiscussion", body)
		val clazz = com.ecwid.upsource.rpc.projects.DiscussionInFileDTO::class.java
		return serializer.deserialize(transportResponse, clazz)
	}

	override fun resolveDiscussion(request: com.ecwid.upsource.rpc.projects.ResolveDiscussionRequestDTO): RpcResponse<com.ecwid.upsource.rpc.VoidMessage> {
		val body = serializer.serialize(request)
		val transportResponse = transport.makeRequest("resolveDiscussion", body)
		val clazz = com.ecwid.upsource.rpc.VoidMessage::class.java
		return serializer.deserialize(transportResponse, clazz)
	}

	override fun getCurrentUserCanResolveDiscussion(request: com.ecwid.upsource.rpc.projects.DiscussionIdDTO): RpcResponse<com.ecwid.upsource.rpc.VoidMessage> {
		val body = serializer.serialize(request)
		val transportResponse = transport.makeRequest("getCurrentUserCanResolveDiscussion", body)
		val clazz = com.ecwid.upsource.rpc.VoidMessage::class.java
		return serializer.deserialize(transportResponse, clazz)
	}

	override fun addDiscussionLabel(request: com.ecwid.upsource.rpc.projects.UpdateDiscussionLabelRequestDTO): RpcResponse<com.ecwid.upsource.rpc.projects.LabelDTO> {
		val body = serializer.serialize(request)
		val transportResponse = transport.makeRequest("addDiscussionLabel", body)
		val clazz = com.ecwid.upsource.rpc.projects.LabelDTO::class.java
		return serializer.deserialize(transportResponse, clazz)
	}

	override fun addReviewLabel(request: com.ecwid.upsource.rpc.projects.UpdateReviewLabelRequestDTO): RpcResponse<com.ecwid.upsource.rpc.projects.UpdateReviewLabelResponseDTO> {
		val body = serializer.serialize(request)
		val transportResponse = transport.makeRequest("addReviewLabel", body)
		val clazz = com.ecwid.upsource.rpc.projects.UpdateReviewLabelResponseDTO::class.java
		return serializer.deserialize(transportResponse, clazz)
	}

	override fun removeDiscussionLabel(request: com.ecwid.upsource.rpc.projects.UpdateDiscussionLabelRequestDTO): RpcResponse<com.ecwid.upsource.rpc.VoidMessage> {
		val body = serializer.serialize(request)
		val transportResponse = transport.makeRequest("removeDiscussionLabel", body)
		val clazz = com.ecwid.upsource.rpc.VoidMessage::class.java
		return serializer.deserialize(transportResponse, clazz)
	}

	override fun removeReviewLabel(request: com.ecwid.upsource.rpc.projects.UpdateReviewLabelRequestDTO): RpcResponse<com.ecwid.upsource.rpc.projects.UpdateReviewLabelResponseDTO> {
		val body = serializer.serialize(request)
		val transportResponse = transport.makeRequest("removeReviewLabel", body)
		val clazz = com.ecwid.upsource.rpc.projects.UpdateReviewLabelResponseDTO::class.java
		return serializer.deserialize(transportResponse, clazz)
	}

	override fun starDiscussion(request: com.ecwid.upsource.rpc.projects.UpdateDiscussionFlagRequestDTO): RpcResponse<com.ecwid.upsource.rpc.VoidMessage> {
		val body = serializer.serialize(request)
		val transportResponse = transport.makeRequest("starDiscussion", body)
		val clazz = com.ecwid.upsource.rpc.VoidMessage::class.java
		return serializer.deserialize(transportResponse, clazz)
	}

	override fun readDiscussion(request: com.ecwid.upsource.rpc.projects.UpdateDiscussionFlagRequestDTO): RpcResponse<com.ecwid.upsource.rpc.VoidMessage> {
		val body = serializer.serialize(request)
		val transportResponse = transport.makeRequest("readDiscussion", body)
		val clazz = com.ecwid.upsource.rpc.VoidMessage::class.java
		return serializer.deserialize(transportResponse, clazz)
	}

	override fun addComment(request: com.ecwid.upsource.rpc.projects.AddCommentRequestDTO): RpcResponse<com.ecwid.upsource.rpc.projects.CommentDTO> {
		val body = serializer.serialize(request)
		val transportResponse = transport.makeRequest("addComment", body)
		val clazz = com.ecwid.upsource.rpc.projects.CommentDTO::class.java
		return serializer.deserialize(transportResponse, clazz)
	}

	override fun updateComment(request: com.ecwid.upsource.rpc.projects.UpdateCommentRequestDTO): RpcResponse<com.ecwid.upsource.rpc.projects.UpdateCommentResponseDTO> {
		val body = serializer.serialize(request)
		val transportResponse = transport.makeRequest("updateComment", body)
		val clazz = com.ecwid.upsource.rpc.projects.UpdateCommentResponseDTO::class.java
		return serializer.deserialize(transportResponse, clazz)
	}

	override fun removeComment(request: com.ecwid.upsource.rpc.projects.RemoveCommentRequestDTO): RpcResponse<com.ecwid.upsource.rpc.projects.RemoveCommentResponseDTO> {
		val body = serializer.serialize(request)
		val transportResponse = transport.makeRequest("removeComment", body)
		val clazz = com.ecwid.upsource.rpc.projects.RemoveCommentResponseDTO::class.java
		return serializer.deserialize(transportResponse, clazz)
	}

	override fun updateTaskList(request: com.ecwid.upsource.rpc.projects.UpdateTaskListRequestDTO): RpcResponse<com.ecwid.upsource.rpc.projects.UpdateCommentResponseDTO> {
		val body = serializer.serialize(request)
		val transportResponse = transport.makeRequest("updateTaskList", body)
		val clazz = com.ecwid.upsource.rpc.projects.UpdateCommentResponseDTO::class.java
		return serializer.deserialize(transportResponse, clazz)
	}

	override fun toggleReaction(request: com.ecwid.upsource.rpc.projects.ToggleReactionRequestDTO): RpcResponse<com.ecwid.upsource.rpc.VoidMessage> {
		val body = serializer.serialize(request)
		val transportResponse = transport.makeRequest("toggleReaction", body)
		val clazz = com.ecwid.upsource.rpc.VoidMessage::class.java
		return serializer.deserialize(transportResponse, clazz)
	}

	override fun getFeed(request: com.ecwid.upsource.rpc.projects.FeedRequestDTO): RpcResponse<com.ecwid.upsource.rpc.projects.FeedDTO> {
		val body = serializer.serialize(request)
		val transportResponse = transport.makeRequest("getFeed", body)
		val clazz = com.ecwid.upsource.rpc.projects.FeedDTO::class.java
		return serializer.deserialize(transportResponse, clazz)
	}

	override fun getRevisionDiscussions(request: com.ecwid.upsource.rpc.RevisionInProjectDTO): RpcResponse<com.ecwid.upsource.rpc.projects.DiscussionsInRevisionDTO> {
		val body = serializer.serialize(request)
		val transportResponse = transport.makeRequest("getRevisionDiscussions", body)
		val clazz = com.ecwid.upsource.rpc.projects.DiscussionsInRevisionDTO::class.java
		return serializer.deserialize(transportResponse, clazz)
	}

	override fun getRevisionReviewInfo(request: com.ecwid.upsource.rpc.projects.RevisionListDTO): RpcResponse<com.ecwid.upsource.rpc.projects.RevisionReviewInfoListDTO> {
		val body = serializer.serialize(request)
		val transportResponse = transport.makeRequest("getRevisionReviewInfo", body)
		val clazz = com.ecwid.upsource.rpc.projects.RevisionReviewInfoListDTO::class.java
		return serializer.deserialize(transportResponse, clazz)
	}

	override fun getSuggestedReviewsForRevisions(request: com.ecwid.upsource.rpc.projects.RevisionListDTO): RpcResponse<com.ecwid.upsource.rpc.projects.SuggestedReviewListDTO> {
		val body = serializer.serialize(request)
		val transportResponse = transport.makeRequest("getSuggestedReviewsForRevisions", body)
		val clazz = com.ecwid.upsource.rpc.projects.SuggestedReviewListDTO::class.java
		return serializer.deserialize(transportResponse, clazz)
	}

	override fun getSuggestedReviewForGhosts(request: com.ecwid.upsource.rpc.projects.UncommittedRevisionDTO): RpcResponse<com.ecwid.upsource.rpc.projects.ReviewSuggestDTO> {
		val body = serializer.serialize(request)
		val transportResponse = transport.makeRequest("getSuggestedReviewForGhosts", body)
		val clazz = com.ecwid.upsource.rpc.projects.ReviewSuggestDTO::class.java
		return serializer.deserialize(transportResponse, clazz)
	}

	override fun getRevisionDiscussionCounters(request: com.ecwid.upsource.rpc.projects.RevisionDiscussionCountersRequestDTO): RpcResponse<com.ecwid.upsource.rpc.projects.RevisionDiscussionCountersListDTO> {
		val body = serializer.serialize(request)
		val transportResponse = transport.makeRequest("getRevisionDiscussionCounters", body)
		val clazz = com.ecwid.upsource.rpc.projects.RevisionDiscussionCountersListDTO::class.java
		return serializer.deserialize(transportResponse, clazz)
	}

	override fun getRevisionBuildStatus(request: com.ecwid.upsource.rpc.projects.RevisionListDTO): RpcResponse<com.ecwid.upsource.rpc.projects.RevisionBuildStatusListDTO> {
		val body = serializer.serialize(request)
		val transportResponse = transport.makeRequest("getRevisionBuildStatus", body)
		val clazz = com.ecwid.upsource.rpc.projects.RevisionBuildStatusListDTO::class.java
		return serializer.deserialize(transportResponse, clazz)
	}

	override fun getRevisionsOwnershipSummary(request: com.ecwid.upsource.rpc.projects.RevisionListDTO): RpcResponse<com.ecwid.upsource.rpc.projects.RevisionsOwnershipSummaryDTO> {
		val body = serializer.serialize(request)
		val transportResponse = transport.makeRequest("getRevisionsOwnershipSummary", body)
		val clazz = com.ecwid.upsource.rpc.projects.RevisionsOwnershipSummaryDTO::class.java
		return serializer.deserialize(transportResponse, clazz)
	}

	override fun getRevisionsExternalInspectionsDiff(request: com.ecwid.upsource.rpc.projects.RevisionListDTO): RpcResponse<com.ecwid.upsource.rpc.projects.RevisionsExternalInspectionsDiffResponseDTO> {
		val body = serializer.serialize(request)
		val transportResponse = transport.makeRequest("getRevisionsExternalInspectionsDiff", body)
		val clazz = com.ecwid.upsource.rpc.projects.RevisionsExternalInspectionsDiffResponseDTO::class.java
		return serializer.deserialize(transportResponse, clazz)
	}

	override fun getUsersForMention(request: com.ecwid.upsource.rpc.users.UsersForMentionRequestDTO): RpcResponse<com.ecwid.upsource.rpc.users.UsersListDTO> {
		val body = serializer.serialize(request)
		val transportResponse = transport.makeRequest("getUsersForMention", body)
		val clazz = com.ecwid.upsource.rpc.users.UsersListDTO::class.java
		return serializer.deserialize(transportResponse, clazz)
	}

	override fun getUsersForReview(request: com.ecwid.upsource.rpc.users.UsersForReviewRequestDTO): RpcResponse<com.ecwid.upsource.rpc.users.UsersForReviewDTO> {
		val body = serializer.serialize(request)
		val transportResponse = transport.makeRequest("getUsersForReview", body)
		val clazz = com.ecwid.upsource.rpc.users.UsersForReviewDTO::class.java
		return serializer.deserialize(transportResponse, clazz)
	}

	override fun getProjectUserGroups(request: com.ecwid.upsource.rpc.users.ProjectUserGroupsRequestDTO): RpcResponse<com.ecwid.upsource.rpc.users.UserGroupsListDTO> {
		val body = serializer.serialize(request)
		val transportResponse = transport.makeRequest("getProjectUserGroups", body)
		val clazz = com.ecwid.upsource.rpc.users.UserGroupsListDTO::class.java
		return serializer.deserialize(transportResponse, clazz)
	}

	override fun getUserGroupsByIds(request: com.ecwid.upsource.rpc.users.UserGroupsIdsListDTO): RpcResponse<com.ecwid.upsource.rpc.users.UserGroupsListDTO> {
		val body = serializer.serialize(request)
		val transportResponse = transport.makeRequest("getUserGroupsByIds", body)
		val clazz = com.ecwid.upsource.rpc.users.UserGroupsListDTO::class.java
		return serializer.deserialize(transportResponse, clazz)
	}

	override fun findUsers(request: com.ecwid.upsource.rpc.users.FindUsersRequestDTO): RpcResponse<com.ecwid.upsource.rpc.users.UserInfoResponseDTO> {
		val body = serializer.serialize(request)
		val transportResponse = transport.makeRequest("findUsers", body)
		val clazz = com.ecwid.upsource.rpc.users.UserInfoResponseDTO::class.java
		return serializer.deserialize(transportResponse, clazz)
	}

	override fun getLabels(request: com.ecwid.upsource.rpc.projects.LabelsRequestDTO): RpcResponse<com.ecwid.upsource.rpc.projects.LabelsListDTO> {
		val body = serializer.serialize(request)
		val transportResponse = transport.makeRequest("getLabels", body)
		val clazz = com.ecwid.upsource.rpc.projects.LabelsListDTO::class.java
		return serializer.deserialize(transportResponse, clazz)
	}

	override fun getReviewLabels(request: com.ecwid.upsource.rpc.projects.LabelsRequestDTO): RpcResponse<com.ecwid.upsource.rpc.projects.LabelsListDTO> {
		val body = serializer.serialize(request)
		val transportResponse = transport.makeRequest("getReviewLabels", body)
		val clazz = com.ecwid.upsource.rpc.projects.LabelsListDTO::class.java
		return serializer.deserialize(transportResponse, clazz)
	}

	override fun getReviews(request: com.ecwid.upsource.rpc.projects.ReviewsRequestDTO): RpcResponse<com.ecwid.upsource.rpc.projects.ReviewListDTO> {
		val body = serializer.serialize(request)
		val transportResponse = transport.makeRequest("getReviews", body)
		val clazz = com.ecwid.upsource.rpc.projects.ReviewListDTO::class.java
		return serializer.deserialize(transportResponse, clazz)
	}

	override fun createReview(request: com.ecwid.upsource.rpc.projects.CreateReviewRequestDTO): RpcResponse<com.ecwid.upsource.rpc.projects.ReviewDescriptorDTO> {
		val body = serializer.serialize(request)
		val transportResponse = transport.makeRequest("createReview", body)
		val clazz = com.ecwid.upsource.rpc.projects.ReviewDescriptorDTO::class.java
		return serializer.deserialize(transportResponse, clazz)
	}

	override fun closeReview(request: com.ecwid.upsource.rpc.projects.CloseReviewRequestDTO): RpcResponse<com.ecwid.upsource.rpc.projects.CloseReviewResponseDTO> {
		val body = serializer.serialize(request)
		val transportResponse = transport.makeRequest("closeReview", body)
		val clazz = com.ecwid.upsource.rpc.projects.CloseReviewResponseDTO::class.java
		return serializer.deserialize(transportResponse, clazz)
	}

	override fun renameReview(request: com.ecwid.upsource.rpc.projects.RenameReviewRequestDTO): RpcResponse<com.ecwid.upsource.rpc.projects.RenameReviewResponseDTO> {
		val body = serializer.serialize(request)
		val transportResponse = transport.makeRequest("renameReview", body)
		val clazz = com.ecwid.upsource.rpc.projects.RenameReviewResponseDTO::class.java
		return serializer.deserialize(transportResponse, clazz)
	}

	override fun editReviewDescription(request: com.ecwid.upsource.rpc.projects.EditReviewDescriptionRequestDTO): RpcResponse<com.ecwid.upsource.rpc.VoidMessage> {
		val body = serializer.serialize(request)
		val transportResponse = transport.makeRequest("editReviewDescription", body)
		val clazz = com.ecwid.upsource.rpc.VoidMessage::class.java
		return serializer.deserialize(transportResponse, clazz)
	}

	override fun getReviewDetails(request: com.ecwid.upsource.rpc.ReviewIdDTO): RpcResponse<com.ecwid.upsource.rpc.projects.ReviewDescriptorDTO> {
		val body = serializer.serialize(request)
		val transportResponse = transport.makeRequest("getReviewDetails", body)
		val clazz = com.ecwid.upsource.rpc.projects.ReviewDescriptorDTO::class.java
		return serializer.deserialize(transportResponse, clazz)
	}

	override fun getReviewOwnershipSummary(request: com.ecwid.upsource.rpc.ReviewIdDTO): RpcResponse<com.ecwid.upsource.rpc.projects.ReviewOwnershipSummaryDTO> {
		val body = serializer.serialize(request)
		val transportResponse = transport.makeRequest("getReviewOwnershipSummary", body)
		val clazz = com.ecwid.upsource.rpc.projects.ReviewOwnershipSummaryDTO::class.java
		return serializer.deserialize(transportResponse, clazz)
	}

	override fun getReviewProgress(request: com.ecwid.upsource.rpc.ReviewIdDTO): RpcResponse<com.ecwid.upsource.rpc.projects.ReviewProgressDTO> {
		val body = serializer.serialize(request)
		val transportResponse = transport.makeRequest("getReviewProgress", body)
		val clazz = com.ecwid.upsource.rpc.projects.ReviewProgressDTO::class.java
		return serializer.deserialize(transportResponse, clazz)
	}

	override fun getReviewInspectionsDiff(request: com.ecwid.upsource.rpc.projects.ReviewInspectionsDiffRequestDTO): RpcResponse<com.ecwid.upsource.rpc.files.InspectionsDiffDTO> {
		val body = serializer.serialize(request)
		val transportResponse = transport.makeRequest("getReviewInspectionsDiff", body)
		val clazz = com.ecwid.upsource.rpc.files.InspectionsDiffDTO::class.java
		return serializer.deserialize(transportResponse, clazz)
	}

	override fun addRevisionToReview(request: com.ecwid.upsource.rpc.projects.RevisionsInReviewDTO): RpcResponse<com.ecwid.upsource.rpc.VoidMessage> {
		val body = serializer.serialize(request)
		val transportResponse = transport.makeRequest("addRevisionToReview", body)
		val clazz = com.ecwid.upsource.rpc.VoidMessage::class.java
		return serializer.deserialize(transportResponse, clazz)
	}

	override fun startBranchTracking(request: com.ecwid.upsource.rpc.projects.StartBranchTrackingRequestDTO): RpcResponse<com.ecwid.upsource.rpc.VoidMessage> {
		val body = serializer.serialize(request)
		val transportResponse = transport.makeRequest("startBranchTracking", body)
		val clazz = com.ecwid.upsource.rpc.VoidMessage::class.java
		return serializer.deserialize(transportResponse, clazz)
	}

	override fun stopBranchTracking(request: com.ecwid.upsource.rpc.projects.StopBranchTrackingRequestDTO): RpcResponse<com.ecwid.upsource.rpc.VoidMessage> {
		val body = serializer.serialize(request)
		val transportResponse = transport.makeRequest("stopBranchTracking", body)
		val clazz = com.ecwid.upsource.rpc.VoidMessage::class.java
		return serializer.deserialize(transportResponse, clazz)
	}

	override fun squashReviewRevisions(request: com.ecwid.upsource.rpc.ReviewIdDTO): RpcResponse<com.ecwid.upsource.rpc.VoidMessage> {
		val body = serializer.serialize(request)
		val transportResponse = transport.makeRequest("squashReviewRevisions", body)
		val clazz = com.ecwid.upsource.rpc.VoidMessage::class.java
		return serializer.deserialize(transportResponse, clazz)
	}

	override fun removeRevisionFromReview(request: com.ecwid.upsource.rpc.projects.RevisionsInReviewDTO): RpcResponse<com.ecwid.upsource.rpc.VoidMessage> {
		val body = serializer.serialize(request)
		val transportResponse = transport.makeRequest("removeRevisionFromReview", body)
		val clazz = com.ecwid.upsource.rpc.VoidMessage::class.java
		return serializer.deserialize(transportResponse, clazz)
	}

	override fun getRevisionsInReview(request: com.ecwid.upsource.rpc.ReviewIdDTO): RpcResponse<com.ecwid.upsource.rpc.projects.RevisionsInReviewResponseDTO> {
		val body = serializer.serialize(request)
		val transportResponse = transport.makeRequest("getRevisionsInReview", body)
		val clazz = com.ecwid.upsource.rpc.projects.RevisionsInReviewResponseDTO::class.java
		return serializer.deserialize(transportResponse, clazz)
	}

	override fun getSuggestedRevisionsForReview(request: com.ecwid.upsource.rpc.ReviewIdDTO): RpcResponse<com.ecwid.upsource.rpc.projects.SuggestedRevisionListDTO> {
		val body = serializer.serialize(request)
		val transportResponse = transport.makeRequest("getSuggestedRevisionsForReview", body)
		val clazz = com.ecwid.upsource.rpc.projects.SuggestedRevisionListDTO::class.java
		return serializer.deserialize(transportResponse, clazz)
	}

	override fun addParticipantToReview(request: com.ecwid.upsource.rpc.projects.ParticipantInReviewRequestDTO): RpcResponse<com.ecwid.upsource.rpc.VoidMessage> {
		val body = serializer.serialize(request)
		val transportResponse = transport.makeRequest("addParticipantToReview", body)
		val clazz = com.ecwid.upsource.rpc.VoidMessage::class.java
		return serializer.deserialize(transportResponse, clazz)
	}

	override fun addGroupToReview(request: com.ecwid.upsource.rpc.projects.AddGroupToReviewRequestDTO): RpcResponse<com.ecwid.upsource.rpc.projects.AddGroupToReviewResponseDTO> {
		val body = serializer.serialize(request)
		val transportResponse = transport.makeRequest("addGroupToReview", body)
		val clazz = com.ecwid.upsource.rpc.projects.AddGroupToReviewResponseDTO::class.java
		return serializer.deserialize(transportResponse, clazz)
	}

	override fun updateParticipantInReview(request: com.ecwid.upsource.rpc.projects.UpdateParticipantInReviewRequestDTO): RpcResponse<com.ecwid.upsource.rpc.projects.UpdateParticipantInReviewResponseDTO> {
		val body = serializer.serialize(request)
		val transportResponse = transport.makeRequest("updateParticipantInReview", body)
		val clazz = com.ecwid.upsource.rpc.projects.UpdateParticipantInReviewResponseDTO::class.java
		return serializer.deserialize(transportResponse, clazz)
	}

	override fun removeParticipantFromReview(request: com.ecwid.upsource.rpc.projects.ParticipantInReviewRequestDTO): RpcResponse<com.ecwid.upsource.rpc.VoidMessage> {
		val body = serializer.serialize(request)
		val transportResponse = transport.makeRequest("removeParticipantFromReview", body)
		val clazz = com.ecwid.upsource.rpc.VoidMessage::class.java
		return serializer.deserialize(transportResponse, clazz)
	}

	override fun toggleReviewMuted(request: com.ecwid.upsource.rpc.projects.ToggleReviewMutedRequestDTO): RpcResponse<com.ecwid.upsource.rpc.VoidMessage> {
		val body = serializer.serialize(request)
		val transportResponse = transport.makeRequest("toggleReviewMuted", body)
		val clazz = com.ecwid.upsource.rpc.VoidMessage::class.java
		return serializer.deserialize(transportResponse, clazz)
	}

	override fun setReviewDeadline(request: com.ecwid.upsource.rpc.projects.ReviewDeadlineRequestDTO): RpcResponse<com.ecwid.upsource.rpc.VoidMessage> {
		val body = serializer.serialize(request)
		val transportResponse = transport.makeRequest("setReviewDeadline", body)
		val clazz = com.ecwid.upsource.rpc.VoidMessage::class.java
		return serializer.deserialize(transportResponse, clazz)
	}

	override fun setReviewTargetBranch(request: com.ecwid.upsource.rpc.projects.ReviewTargetBranchDTO): RpcResponse<com.ecwid.upsource.rpc.VoidMessage> {
		val body = serializer.serialize(request)
		val transportResponse = transport.makeRequest("setReviewTargetBranch", body)
		val clazz = com.ecwid.upsource.rpc.VoidMessage::class.java
		return serializer.deserialize(transportResponse, clazz)
	}

	override fun getReviewSummaryChanges(request: com.ecwid.upsource.rpc.projects.ReviewSummaryChangesRequestDTO): RpcResponse<com.ecwid.upsource.rpc.projects.ReviewSummaryChangesResponseDTO> {
		val body = serializer.serialize(request)
		val transportResponse = transport.makeRequest("getReviewSummaryChanges", body)
		val clazz = com.ecwid.upsource.rpc.projects.ReviewSummaryChangesResponseDTO::class.java
		return serializer.deserialize(transportResponse, clazz)
	}

	override fun getFileInReviewSummaryInlineChanges(request: com.ecwid.upsource.rpc.projects.FileInReviewDiffRequestDTO): RpcResponse<com.ecwid.upsource.rpc.projects.FileInlineDiffResponseDTO> {
		val body = serializer.serialize(request)
		val transportResponse = transport.makeRequest("getFileInReviewSummaryInlineChanges", body)
		val clazz = com.ecwid.upsource.rpc.projects.FileInlineDiffResponseDTO::class.java
		return serializer.deserialize(transportResponse, clazz)
	}

	override fun getFileInReviewSummaryDiff(request: com.ecwid.upsource.rpc.projects.FileInReviewDiffRequestDTO): RpcResponse<com.ecwid.upsource.rpc.projects.FileDiffResponseDTO> {
		val body = serializer.serialize(request)
		val transportResponse = transport.makeRequest("getFileInReviewSummaryDiff", body)
		val clazz = com.ecwid.upsource.rpc.projects.FileDiffResponseDTO::class.java
		return serializer.deserialize(transportResponse, clazz)
	}

	override fun setFileInReviewReadStatus(request: com.ecwid.upsource.rpc.projects.FileInReviewReadStatusRequestDTO): RpcResponse<com.ecwid.upsource.rpc.VoidMessage> {
		val body = serializer.serialize(request)
		val transportResponse = transport.makeRequest("setFileInReviewReadStatus", body)
		val clazz = com.ecwid.upsource.rpc.VoidMessage::class.java
		return serializer.deserialize(transportResponse, clazz)
	}

	override fun getReviewSummaryDiscussions(request: com.ecwid.upsource.rpc.projects.ReviewSummaryDiscussionsRequestDTO): RpcResponse<com.ecwid.upsource.rpc.projects.DiscussionsInFilesDTO> {
		val body = serializer.serialize(request)
		val transportResponse = transport.makeRequest("getReviewSummaryDiscussions", body)
		val clazz = com.ecwid.upsource.rpc.projects.DiscussionsInFilesDTO::class.java
		return serializer.deserialize(transportResponse, clazz)
	}

	override fun removeReview(request: com.ecwid.upsource.rpc.ReviewIdDTO): RpcResponse<com.ecwid.upsource.rpc.VoidMessage> {
		val body = serializer.serialize(request)
		val transportResponse = transport.makeRequest("removeReview", body)
		val clazz = com.ecwid.upsource.rpc.VoidMessage::class.java
		return serializer.deserialize(transportResponse, clazz)
	}

	override fun getMatchingRevisionsForStacktrace(request: com.ecwid.upsource.rpc.projects.StacktraceDTO): RpcResponse<com.ecwid.upsource.rpc.projects.MatchingRevisionsResponseDTO> {
		val body = serializer.serialize(request)
		val transportResponse = transport.makeRequest("getMatchingRevisionsForStacktrace", body)
		val clazz = com.ecwid.upsource.rpc.projects.MatchingRevisionsResponseDTO::class.java
		return serializer.deserialize(transportResponse, clazz)
	}

	override fun getStacktraceInContextOfRevision(request: com.ecwid.upsource.rpc.projects.StacktraceDTO): RpcResponse<com.ecwid.upsource.rpc.projects.StacktracePositionsDTO> {
		val body = serializer.serialize(request)
		val transportResponse = transport.makeRequest("getStacktraceInContextOfRevision", body)
		val clazz = com.ecwid.upsource.rpc.projects.StacktracePositionsDTO::class.java
		return serializer.deserialize(transportResponse, clazz)
	}

	override fun getCurrentUser(request: com.ecwid.upsource.rpc.VoidMessage): RpcResponse<com.ecwid.upsource.rpc.users.CurrentUserResponseDTO> {
		val body = serializer.serialize(request)
		val transportResponse = transport.makeRequest("getCurrentUser", body)
		val clazz = com.ecwid.upsource.rpc.users.CurrentUserResponseDTO::class.java
		return serializer.deserialize(transportResponse, clazz)
	}

	override fun getCurrentUserCanCloseReview(request: com.ecwid.upsource.rpc.ReviewIdDTO): RpcResponse<com.ecwid.upsource.rpc.VoidMessage> {
		val body = serializer.serialize(request)
		val transportResponse = transport.makeRequest("getCurrentUserCanCloseReview", body)
		val clazz = com.ecwid.upsource.rpc.VoidMessage::class.java
		return serializer.deserialize(transportResponse, clazz)
	}

	override fun getCurrentUserCanDeleteReview(request: com.ecwid.upsource.rpc.ReviewIdDTO): RpcResponse<com.ecwid.upsource.rpc.VoidMessage> {
		val body = serializer.serialize(request)
		val transportResponse = transport.makeRequest("getCurrentUserCanDeleteReview", body)
		val clazz = com.ecwid.upsource.rpc.VoidMessage::class.java
		return serializer.deserialize(transportResponse, clazz)
	}

	override fun getUserInfo(request: com.ecwid.upsource.rpc.users.UserInfoRequestDTO): RpcResponse<com.ecwid.upsource.rpc.users.UserInfoResponseDTO> {
		val body = serializer.serialize(request)
		val transportResponse = transport.makeRequest("getUserInfo", body)
		val clazz = com.ecwid.upsource.rpc.users.UserInfoResponseDTO::class.java
		return serializer.deserialize(transportResponse, clazz)
	}

	override fun getUsersPresenceInfo(request: com.ecwid.upsource.rpc.users.UserInfoRequestDTO): RpcResponse<com.ecwid.upsource.rpc.users.UsersPresenceInfoResponseDTO> {
		val body = serializer.serialize(request)
		val transportResponse = transport.makeRequest("getUsersPresenceInfo", body)
		val clazz = com.ecwid.upsource.rpc.users.UsersPresenceInfoResponseDTO::class.java
		return serializer.deserialize(transportResponse, clazz)
	}

	override fun bindVcsUsername(request: com.ecwid.upsource.rpc.users.BindVcsUsernameRequestDTO): RpcResponse<com.ecwid.upsource.rpc.VoidMessage> {
		val body = serializer.serialize(request)
		val transportResponse = transport.makeRequest("bindVcsUsername", body)
		val clazz = com.ecwid.upsource.rpc.VoidMessage::class.java
		return serializer.deserialize(transportResponse, clazz)
	}

	override fun getUserProjects(request: com.ecwid.upsource.rpc.users.UserProjectsRequestDTO): RpcResponse<com.ecwid.upsource.rpc.users.UserProjectsResponseDTO> {
		val body = serializer.serialize(request)
		val transportResponse = transport.makeRequest("getUserProjects", body)
		val clazz = com.ecwid.upsource.rpc.users.UserProjectsResponseDTO::class.java
		return serializer.deserialize(transportResponse, clazz)
	}

	override fun setUserAbsence(request: com.ecwid.upsource.rpc.users.UserAbsenceRequestDTO): RpcResponse<com.ecwid.upsource.rpc.VoidMessage> {
		val body = serializer.serialize(request)
		val transportResponse = transport.makeRequest("setUserAbsence", body)
		val clazz = com.ecwid.upsource.rpc.VoidMessage::class.java
		return serializer.deserialize(transportResponse, clazz)
	}

	override fun getUserSetting(request: com.ecwid.upsource.rpc.misc.GetSettingRequestDTO): RpcResponse<com.ecwid.upsource.rpc.misc.GetSettingResponseDTO> {
		val body = serializer.serialize(request)
		val transportResponse = transport.makeRequest("getUserSetting", body)
		val clazz = com.ecwid.upsource.rpc.misc.GetSettingResponseDTO::class.java
		return serializer.deserialize(transportResponse, clazz)
	}

	override fun setUserSetting(request: com.ecwid.upsource.rpc.misc.SetSettingRequestDTO): RpcResponse<com.ecwid.upsource.rpc.VoidMessage> {
		val body = serializer.serialize(request)
		val transportResponse = transport.makeRequest("setUserSetting", body)
		val clazz = com.ecwid.upsource.rpc.VoidMessage::class.java
		return serializer.deserialize(transportResponse, clazz)
	}

	override fun getClusterSetting(request: com.ecwid.upsource.rpc.misc.GetSettingRequestDTO): RpcResponse<com.ecwid.upsource.rpc.misc.GetSettingResponseDTO> {
		val body = serializer.serialize(request)
		val transportResponse = transport.makeRequest("getClusterSetting", body)
		val clazz = com.ecwid.upsource.rpc.misc.GetSettingResponseDTO::class.java
		return serializer.deserialize(transportResponse, clazz)
	}

	override fun setClusterSetting(request: com.ecwid.upsource.rpc.misc.SetSettingRequestDTO): RpcResponse<com.ecwid.upsource.rpc.VoidMessage> {
		val body = serializer.serialize(request)
		val transportResponse = transport.makeRequest("setClusterSetting", body)
		val clazz = com.ecwid.upsource.rpc.VoidMessage::class.java
		return serializer.deserialize(transportResponse, clazz)
	}

	override fun setMotto(request: com.ecwid.upsource.rpc.misc.SetMottoRequestDTO): RpcResponse<com.ecwid.upsource.rpc.VoidMessage> {
		val body = serializer.serialize(request)
		val transportResponse = transport.makeRequest("setMotto", body)
		val clazz = com.ecwid.upsource.rpc.VoidMessage::class.java
		return serializer.deserialize(transportResponse, clazz)
	}

	override fun getProjectSetting(request: com.ecwid.upsource.rpc.misc.GetProjectSettingRequestDTO): RpcResponse<com.ecwid.upsource.rpc.misc.GetSettingResponseDTO> {
		val body = serializer.serialize(request)
		val transportResponse = transport.makeRequest("getProjectSetting", body)
		val clazz = com.ecwid.upsource.rpc.misc.GetSettingResponseDTO::class.java
		return serializer.deserialize(transportResponse, clazz)
	}

	override fun setProjectSetting(request: com.ecwid.upsource.rpc.misc.SetProjectSettingRequestDTO): RpcResponse<com.ecwid.upsource.rpc.VoidMessage> {
		val body = serializer.serialize(request)
		val transportResponse = transport.makeRequest("setProjectSetting", body)
		val clazz = com.ecwid.upsource.rpc.VoidMessage::class.java
		return serializer.deserialize(transportResponse, clazz)
	}

	override fun setProjectWebhooks(request: com.ecwid.upsource.rpc.misc.SetProjectWebhooksRequestDTO): RpcResponse<com.ecwid.upsource.rpc.VoidMessage> {
		val body = serializer.serialize(request)
		val transportResponse = transport.makeRequest("setProjectWebhooks", body)
		val clazz = com.ecwid.upsource.rpc.VoidMessage::class.java
		return serializer.deserialize(transportResponse, clazz)
	}

	override fun createProject(request: com.ecwid.upsource.rpc.projects.CreateProjectRequestDTO): RpcResponse<com.ecwid.upsource.rpc.VoidMessage> {
		val body = serializer.serialize(request)
		val transportResponse = transport.makeRequest("createProject", body)
		val clazz = com.ecwid.upsource.rpc.VoidMessage::class.java
		return serializer.deserialize(transportResponse, clazz)
	}

	override fun loadProject(request: com.ecwid.upsource.rpc.ProjectIdDTO): RpcResponse<com.ecwid.upsource.rpc.projects.ProjectSettingsDTO> {
		val body = serializer.serialize(request)
		val transportResponse = transport.makeRequest("loadProject", body)
		val clazz = com.ecwid.upsource.rpc.projects.ProjectSettingsDTO::class.java
		return serializer.deserialize(transportResponse, clazz)
	}

	override fun editProject(request: com.ecwid.upsource.rpc.projects.EditProjectRequestDTO): RpcResponse<com.ecwid.upsource.rpc.VoidMessage> {
		val body = serializer.serialize(request)
		val transportResponse = transport.makeRequest("editProject", body)
		val clazz = com.ecwid.upsource.rpc.VoidMessage::class.java
		return serializer.deserialize(transportResponse, clazz)
	}

	override fun deleteProject(request: com.ecwid.upsource.rpc.ProjectIdDTO): RpcResponse<com.ecwid.upsource.rpc.VoidMessage> {
		val body = serializer.serialize(request)
		val transportResponse = transport.makeRequest("deleteProject", body)
		val clazz = com.ecwid.upsource.rpc.VoidMessage::class.java
		return serializer.deserialize(transportResponse, clazz)
	}

	override fun resetProject(request: com.ecwid.upsource.rpc.ProjectIdDTO): RpcResponse<com.ecwid.upsource.rpc.VoidMessage> {
		val body = serializer.serialize(request)
		val transportResponse = transport.makeRequest("resetProject", body)
		val clazz = com.ecwid.upsource.rpc.VoidMessage::class.java
		return serializer.deserialize(transportResponse, clazz)
	}

	override fun getProjectConfigurationParameters(request: com.ecwid.upsource.rpc.VoidMessage): RpcResponse<com.ecwid.upsource.rpc.projects.ProjectConfigurationResponseDTO> {
		val body = serializer.serialize(request)
		val transportResponse = transport.makeRequest("getProjectConfigurationParameters", body)
		val clazz = com.ecwid.upsource.rpc.projects.ProjectConfigurationResponseDTO::class.java
		return serializer.deserialize(transportResponse, clazz)
	}

	override fun getVcsHostingServices(request: com.ecwid.upsource.rpc.projects.VcsHostingRequestDTO): RpcResponse<com.ecwid.upsource.rpc.projects.VcsHostingResponseDTO> {
		val body = serializer.serialize(request)
		val transportResponse = transport.makeRequest("getVcsHostingServices", body)
		val clazz = com.ecwid.upsource.rpc.projects.VcsHostingResponseDTO::class.java
		return serializer.deserialize(transportResponse, clazz)
	}

	override fun createOrEditLabel(request: com.ecwid.upsource.rpc.projects.EditLabelRequestDTO): RpcResponse<com.ecwid.upsource.rpc.projects.LabelDTO> {
		val body = serializer.serialize(request)
		val transportResponse = transport.makeRequest("createOrEditLabel", body)
		val clazz = com.ecwid.upsource.rpc.projects.LabelDTO::class.java
		return serializer.deserialize(transportResponse, clazz)
	}

	override fun createOrEditReviewLabel(request: com.ecwid.upsource.rpc.projects.EditLabelRequestDTO): RpcResponse<com.ecwid.upsource.rpc.projects.LabelDTO> {
		val body = serializer.serialize(request)
		val transportResponse = transport.makeRequest("createOrEditReviewLabel", body)
		val clazz = com.ecwid.upsource.rpc.projects.LabelDTO::class.java
		return serializer.deserialize(transportResponse, clazz)
	}

	override fun hidePredefinedLabels(request: com.ecwid.upsource.rpc.projects.HidePredefinedLabelsRequestDTO): RpcResponse<com.ecwid.upsource.rpc.VoidMessage> {
		val body = serializer.serialize(request)
		val transportResponse = transport.makeRequest("hidePredefinedLabels", body)
		val clazz = com.ecwid.upsource.rpc.VoidMessage::class.java
		return serializer.deserialize(transportResponse, clazz)
	}

	override fun hidePredefinedReviewLabels(request: com.ecwid.upsource.rpc.projects.HidePredefinedLabelsRequestDTO): RpcResponse<com.ecwid.upsource.rpc.VoidMessage> {
		val body = serializer.serialize(request)
		val transportResponse = transport.makeRequest("hidePredefinedReviewLabels", body)
		val clazz = com.ecwid.upsource.rpc.VoidMessage::class.java
		return serializer.deserialize(transportResponse, clazz)
	}

	override fun deleteLabel(request: com.ecwid.upsource.rpc.projects.EditLabelRequestDTO): RpcResponse<com.ecwid.upsource.rpc.VoidMessage> {
		val body = serializer.serialize(request)
		val transportResponse = transport.makeRequest("deleteLabel", body)
		val clazz = com.ecwid.upsource.rpc.VoidMessage::class.java
		return serializer.deserialize(transportResponse, clazz)
	}

	override fun deleteReviewLabel(request: com.ecwid.upsource.rpc.projects.EditLabelRequestDTO): RpcResponse<com.ecwid.upsource.rpc.VoidMessage> {
		val body = serializer.serialize(request)
		val transportResponse = transport.makeRequest("deleteReviewLabel", body)
		val clazz = com.ecwid.upsource.rpc.VoidMessage::class.java
		return serializer.deserialize(transportResponse, clazz)
	}

	override fun mergeLabels(request: com.ecwid.upsource.rpc.projects.EditLabelsRequestDTO): RpcResponse<com.ecwid.upsource.rpc.projects.LabelDTO> {
		val body = serializer.serialize(request)
		val transportResponse = transport.makeRequest("mergeLabels", body)
		val clazz = com.ecwid.upsource.rpc.projects.LabelDTO::class.java
		return serializer.deserialize(transportResponse, clazz)
	}

	override fun testVcsConnection(request: com.ecwid.upsource.rpc.projects.TestConnectionRequestDTO): RpcResponse<com.ecwid.upsource.rpc.projects.TestConnectionResponseDTO> {
		val body = serializer.serialize(request)
		val transportResponse = transport.makeRequest("testVcsConnection", body)
		val clazz = com.ecwid.upsource.rpc.projects.TestConnectionResponseDTO::class.java
		return serializer.deserialize(transportResponse, clazz)
	}

	override fun testPOP3Mailbox(request: com.ecwid.upsource.rpc.misc.TestPOP3MailboxRequestDTO): RpcResponse<com.ecwid.upsource.rpc.misc.TestPOP3MailboxResponseDTO> {
		val body = serializer.serialize(request)
		val transportResponse = transport.makeRequest("testPOP3Mailbox", body)
		val clazz = com.ecwid.upsource.rpc.misc.TestPOP3MailboxResponseDTO::class.java
		return serializer.deserialize(transportResponse, clazz)
	}

	override fun getReadOnlyMode(request: com.ecwid.upsource.rpc.VoidMessage): RpcResponse<com.ecwid.upsource.rpc.misc.ReadOnlyModeDTO> {
		val body = serializer.serialize(request)
		val transportResponse = transport.makeRequest("getReadOnlyMode", body)
		val clazz = com.ecwid.upsource.rpc.misc.ReadOnlyModeDTO::class.java
		return serializer.deserialize(transportResponse, clazz)
	}

	override fun setReadOnlyMode(request: com.ecwid.upsource.rpc.misc.ReadOnlyModeDTO): RpcResponse<com.ecwid.upsource.rpc.VoidMessage> {
		val body = serializer.serialize(request)
		val transportResponse = transport.makeRequest("setReadOnlyMode", body)
		val clazz = com.ecwid.upsource.rpc.VoidMessage::class.java
		return serializer.deserialize(transportResponse, clazz)
	}

	override fun getEmailBounces(request: com.ecwid.upsource.rpc.VoidMessage): RpcResponse<com.ecwid.upsource.rpc.misc.EmailBouncesResponseDTO> {
		val body = serializer.serialize(request)
		val transportResponse = transport.makeRequest("getEmailBounces", body)
		val clazz = com.ecwid.upsource.rpc.misc.EmailBouncesResponseDTO::class.java
		return serializer.deserialize(transportResponse, clazz)
	}

	override fun resetEmailBounces(request: com.ecwid.upsource.rpc.VoidMessage): RpcResponse<com.ecwid.upsource.rpc.VoidMessage> {
		val body = serializer.serialize(request)
		val transportResponse = transport.makeRequest("resetEmailBounces", body)
		val clazz = com.ecwid.upsource.rpc.VoidMessage::class.java
		return serializer.deserialize(transportResponse, clazz)
	}

	override fun getAllRoles(request: com.ecwid.upsource.rpc.VoidMessage): RpcResponse<com.ecwid.upsource.rpc.projects.AllRolesResponseDTO> {
		val body = serializer.serialize(request)
		val transportResponse = transport.makeRequest("getAllRoles", body)
		val clazz = com.ecwid.upsource.rpc.projects.AllRolesResponseDTO::class.java
		return serializer.deserialize(transportResponse, clazz)
	}

	override fun getUsersRoles(request: com.ecwid.upsource.rpc.projects.UsersRolesRequestDTO): RpcResponse<com.ecwid.upsource.rpc.projects.UsersRolesResponseDTO> {
		val body = serializer.serialize(request)
		val transportResponse = transport.makeRequest("getUsersRoles", body)
		val clazz = com.ecwid.upsource.rpc.projects.UsersRolesResponseDTO::class.java
		return serializer.deserialize(transportResponse, clazz)
	}

	override fun addUserRole(request: com.ecwid.upsource.rpc.projects.AddRoleRequestDTO): RpcResponse<com.ecwid.upsource.rpc.VoidMessage> {
		val body = serializer.serialize(request)
		val transportResponse = transport.makeRequest("addUserRole", body)
		val clazz = com.ecwid.upsource.rpc.VoidMessage::class.java
		return serializer.deserialize(transportResponse, clazz)
	}

	override fun deleteUserRole(request: com.ecwid.upsource.rpc.projects.DeleteRoleRequestDTO): RpcResponse<com.ecwid.upsource.rpc.VoidMessage> {
		val body = serializer.serialize(request)
		val transportResponse = transport.makeRequest("deleteUserRole", body)
		val clazz = com.ecwid.upsource.rpc.VoidMessage::class.java
		return serializer.deserialize(transportResponse, clazz)
	}

	override fun inviteUser(request: com.ecwid.upsource.rpc.projects.InviteUserRequestDTO): RpcResponse<com.ecwid.upsource.rpc.projects.InviteUserResponseDTO> {
		val body = serializer.serialize(request)
		val transportResponse = transport.makeRequest("inviteUser", body)
		val clazz = com.ecwid.upsource.rpc.projects.InviteUserResponseDTO::class.java
		return serializer.deserialize(transportResponse, clazz)
	}

	override fun exportData(request: com.ecwid.upsource.rpc.VoidMessage): RpcResponse<com.ecwid.upsource.rpc.misc.ExportDataResponseDTO> {
		val body = serializer.serialize(request)
		val transportResponse = transport.makeRequest("exportData", body)
		val clazz = com.ecwid.upsource.rpc.misc.ExportDataResponseDTO::class.java
		return serializer.deserialize(transportResponse, clazz)
	}

	override fun getProjectActivity(request: com.ecwid.upsource.rpc.analytics.ProjectActivityRequestDTO): RpcResponse<com.ecwid.upsource.rpc.analytics.ProjectActivityDTO> {
		val body = serializer.serialize(request)
		val transportResponse = transport.makeRequest("getProjectActivity", body)
		val clazz = com.ecwid.upsource.rpc.analytics.ProjectActivityDTO::class.java
		return serializer.deserialize(transportResponse, clazz)
	}

	override fun getContributorsDistribution(request: com.ecwid.upsource.rpc.analytics.ContributorsDistributionRequestDTO): RpcResponse<com.ecwid.upsource.rpc.analytics.ContributorsDistributionDTO> {
		val body = serializer.serialize(request)
		val transportResponse = transport.makeRequest("getContributorsDistribution", body)
		val clazz = com.ecwid.upsource.rpc.analytics.ContributorsDistributionDTO::class.java
		return serializer.deserialize(transportResponse, clazz)
	}

	override fun getResponsibilityDistribution(request: com.ecwid.upsource.rpc.analytics.ResponsibilityDistributionRequestDTO): RpcResponse<com.ecwid.upsource.rpc.analytics.ResponsibilityDistributionDTO> {
		val body = serializer.serialize(request)
		val transportResponse = transport.makeRequest("getResponsibilityDistribution", body)
		val clazz = com.ecwid.upsource.rpc.analytics.ResponsibilityDistributionDTO::class.java
		return serializer.deserialize(transportResponse, clazz)
	}

	override fun getProjectCommitters(request: com.ecwid.upsource.rpc.ProjectIdDTO): RpcResponse<com.ecwid.upsource.rpc.analytics.ProjectCommittersDTO> {
		val body = serializer.serialize(request)
		val transportResponse = transport.makeRequest("getProjectCommitters", body)
		val clazz = com.ecwid.upsource.rpc.analytics.ProjectCommittersDTO::class.java
		return serializer.deserialize(transportResponse, clazz)
	}

	override fun getUserActivity(request: com.ecwid.upsource.rpc.analytics.UserActivityRequestDTO): RpcResponse<com.ecwid.upsource.rpc.analytics.UserActivityDTO> {
		val body = serializer.serialize(request)
		val transportResponse = transport.makeRequest("getUserActivity", body)
		val clazz = com.ecwid.upsource.rpc.analytics.UserActivityDTO::class.java
		return serializer.deserialize(transportResponse, clazz)
	}

	override fun getModulesDistribution(request: com.ecwid.upsource.rpc.analytics.ModulesDistributionRequestDTO): RpcResponse<com.ecwid.upsource.rpc.analytics.ModulesDistributionDTO> {
		val body = serializer.serialize(request)
		val transportResponse = transport.makeRequest("getModulesDistribution", body)
		val clazz = com.ecwid.upsource.rpc.analytics.ModulesDistributionDTO::class.java
		return serializer.deserialize(transportResponse, clazz)
	}

	override fun getCommitsSummary(request: com.ecwid.upsource.rpc.analytics.CommitsSummaryRequestDTO): RpcResponse<com.ecwid.upsource.rpc.analytics.CommitsSummaryDTO> {
		val body = serializer.serialize(request)
		val transportResponse = transport.makeRequest("getCommitsSummary", body)
		val clazz = com.ecwid.upsource.rpc.analytics.CommitsSummaryDTO::class.java
		return serializer.deserialize(transportResponse, clazz)
	}

	override fun getCommitsDetails(request: com.ecwid.upsource.rpc.analytics.CommitsDetailsRequestDTO): RpcResponse<com.ecwid.upsource.rpc.analytics.CommitsDetailsDTO> {
		val body = serializer.serialize(request)
		val transportResponse = transport.makeRequest("getCommitsDetails", body)
		val clazz = com.ecwid.upsource.rpc.analytics.CommitsDetailsDTO::class.java
		return serializer.deserialize(transportResponse, clazz)
	}

	override fun getFileHistoryChart(request: com.ecwid.upsource.rpc.analytics.FileHistoryChartRequestDTO): RpcResponse<com.ecwid.upsource.rpc.analytics.FileHistoryChartDTO> {
		val body = serializer.serialize(request)
		val transportResponse = transport.makeRequest("getFileHistoryChart", body)
		val clazz = com.ecwid.upsource.rpc.analytics.FileHistoryChartDTO::class.java
		return serializer.deserialize(transportResponse, clazz)
	}

	override fun getProjectTreeMap(request: com.ecwid.upsource.rpc.analytics.ProjectTreeMapRequestDTO): RpcResponse<com.ecwid.upsource.rpc.analytics.ProjectTreeMapDTO> {
		val body = serializer.serialize(request)
		val transportResponse = transport.makeRequest("getProjectTreeMap", body)
		val clazz = com.ecwid.upsource.rpc.analytics.ProjectTreeMapDTO::class.java
		return serializer.deserialize(transportResponse, clazz)
	}

	override fun getProjectPulse(request: com.ecwid.upsource.rpc.analytics.ProjectPulseRequestDTO): RpcResponse<com.ecwid.upsource.rpc.analytics.PulseResponseDTO> {
		val body = serializer.serialize(request)
		val transportResponse = transport.makeRequest("getProjectPulse", body)
		val clazz = com.ecwid.upsource.rpc.analytics.PulseResponseDTO::class.java
		return serializer.deserialize(transportResponse, clazz)
	}

	override fun getUserPulse(request: com.ecwid.upsource.rpc.analytics.UserPulseRequestDTO): RpcResponse<com.ecwid.upsource.rpc.analytics.PulseResponseDTO> {
		val body = serializer.serialize(request)
		val transportResponse = transport.makeRequest("getUserPulse", body)
		val clazz = com.ecwid.upsource.rpc.analytics.PulseResponseDTO::class.java
		return serializer.deserialize(transportResponse, clazz)
	}

	override fun getReviewStatistics(request: com.ecwid.upsource.rpc.analytics.ReviewStatisticsRequestDTO): RpcResponse<com.ecwid.upsource.rpc.analytics.ReviewStatisticsDTO> {
		val body = serializer.serialize(request)
		val transportResponse = transport.makeRequest("getReviewStatistics", body)
		val clazz = com.ecwid.upsource.rpc.analytics.ReviewStatisticsDTO::class.java
		return serializer.deserialize(transportResponse, clazz)
	}

	override fun getReviewCoverage(request: com.ecwid.upsource.rpc.analytics.ReviewCoverageRequestDTO): RpcResponse<com.ecwid.upsource.rpc.analytics.ReviewCoverageDTO> {
		val body = serializer.serialize(request)
		val transportResponse = transport.makeRequest("getReviewCoverage", body)
		val clazz = com.ecwid.upsource.rpc.analytics.ReviewCoverageDTO::class.java
		return serializer.deserialize(transportResponse, clazz)
	}

	override fun getReviewTimeStatistics(request: com.ecwid.upsource.rpc.analytics.ReviewTimeStatisticsRequestDTO): RpcResponse<com.ecwid.upsource.rpc.analytics.ReviewTimeStatisticsDTO> {
		val body = serializer.serialize(request)
		val transportResponse = transport.makeRequest("getReviewTimeStatistics", body)
		val clazz = com.ecwid.upsource.rpc.analytics.ReviewTimeStatisticsDTO::class.java
		return serializer.deserialize(transportResponse, clazz)
	}

	override fun getReviewersGraph(request: com.ecwid.upsource.rpc.analytics.ReviewersGraphRequestDTO): RpcResponse<com.ecwid.upsource.rpc.analytics.ReviewersGraphDTO> {
		val body = serializer.serialize(request)
		val transportResponse = transport.makeRequest("getReviewersGraph", body)
		val clazz = com.ecwid.upsource.rpc.analytics.ReviewersGraphDTO::class.java
		return serializer.deserialize(transportResponse, clazz)
	}

	override fun updateUserTimezone(request: com.ecwid.upsource.rpc.misc.UpdateUserTimezoneDTO): RpcResponse<com.ecwid.upsource.rpc.VoidMessage> {
		val body = serializer.serialize(request)
		val transportResponse = transport.makeRequest("updateUserTimezone", body)
		val clazz = com.ecwid.upsource.rpc.VoidMessage::class.java
		return serializer.deserialize(transportResponse, clazz)
	}

	override fun updateAchievementsLastSeen(request: com.ecwid.upsource.rpc.misc.UserActionNotificationDTO): RpcResponse<com.ecwid.upsource.rpc.VoidMessage> {
		val body = serializer.serialize(request)
		val transportResponse = transport.makeRequest("updateAchievementsLastSeen", body)
		val clazz = com.ecwid.upsource.rpc.VoidMessage::class.java
		return serializer.deserialize(transportResponse, clazz)
	}

	override fun getUnlockedUserAchievements(request: com.ecwid.upsource.rpc.misc.UserAchievementsRequestDTO): RpcResponse<com.ecwid.upsource.rpc.misc.AchievementsListDTO> {
		val body = serializer.serialize(request)
		val transportResponse = transport.makeRequest("getUnlockedUserAchievements", body)
		val clazz = com.ecwid.upsource.rpc.misc.AchievementsListDTO::class.java
		return serializer.deserialize(transportResponse, clazz)
	}

	override fun getUnreadUnlockedUserAchievementsCount(request: com.ecwid.upsource.rpc.VoidMessage): RpcResponse<com.ecwid.upsource.rpc.misc.UserAchievementsCountDTO> {
		val body = serializer.serialize(request)
		val transportResponse = transport.makeRequest("getUnreadUnlockedUserAchievementsCount", body)
		val clazz = com.ecwid.upsource.rpc.misc.UserAchievementsCountDTO::class.java
		return serializer.deserialize(transportResponse, clazz)
	}

	override fun getUserAchievements(request: com.ecwid.upsource.rpc.misc.UserAchievementsRequestDTO): RpcResponse<com.ecwid.upsource.rpc.misc.AchievementsListDTO> {
		val body = serializer.serialize(request)
		val transportResponse = transport.makeRequest("getUserAchievements", body)
		val clazz = com.ecwid.upsource.rpc.misc.AchievementsListDTO::class.java
		return serializer.deserialize(transportResponse, clazz)
	}

	override fun getAvailableIssueTrackerProviders(request: com.ecwid.upsource.rpc.VoidMessage): RpcResponse<com.ecwid.upsource.rpc.issuetrackers.IssueTrackerProvidersListDTO> {
		val body = serializer.serialize(request)
		val transportResponse = transport.makeRequest("getAvailableIssueTrackerProviders", body)
		val clazz = com.ecwid.upsource.rpc.issuetrackers.IssueTrackerProvidersListDTO::class.java
		return serializer.deserialize(transportResponse, clazz)
	}

	override fun getIssueInfo(request: com.ecwid.upsource.rpc.issuetrackers.IssueInfoRequestDTO): RpcResponse<com.ecwid.upsource.rpc.issuetrackers.IssueInfoDTO> {
		val body = serializer.serialize(request)
		val transportResponse = transport.makeRequest("getIssueInfo", body)
		val clazz = com.ecwid.upsource.rpc.issuetrackers.IssueInfoDTO::class.java
		return serializer.deserialize(transportResponse, clazz)
	}

	override fun createIssueFromDiscussion(request: com.ecwid.upsource.rpc.issuetrackers.CreateIssueFromDiscussionRequestDTO): RpcResponse<com.ecwid.upsource.rpc.issuetrackers.IssueIdDTO> {
		val body = serializer.serialize(request)
		val transportResponse = transport.makeRequest("createIssueFromDiscussion", body)
		val clazz = com.ecwid.upsource.rpc.issuetrackers.IssueIdDTO::class.java
		return serializer.deserialize(transportResponse, clazz)
	}

	override fun createIssueFromReview(request: com.ecwid.upsource.rpc.issuetrackers.CreateIssueFromReviewRequestDTO): RpcResponse<com.ecwid.upsource.rpc.issuetrackers.IssueIdDTO> {
		val body = serializer.serialize(request)
		val transportResponse = transport.makeRequest("createIssueFromReview", body)
		val clazz = com.ecwid.upsource.rpc.issuetrackers.IssueIdDTO::class.java
		return serializer.deserialize(transportResponse, clazz)
	}
}
