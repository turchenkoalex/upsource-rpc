export const indentation = (content) => {
    return content
        .replace(new RegExp(' {8}', 'g'), '')
        .replace(new RegExp(' {4}', 'g'), '\t');
}
