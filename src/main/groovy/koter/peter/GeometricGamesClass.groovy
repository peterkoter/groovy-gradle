package koter.peter

/**
 * This is a Volume Calculator for 4 different geometric forms:
 * Cuboid, Square Pyramid, Hexagonal Prism and Dodecahedron.
 */

class GeometricGamesClass {
    static cuboidVolume(height, length, depth) {
        height * length * depth
    }

    static squarePyramidVolume(baseEdge, height) {
        baseEdge**2 * height / 3
    }

    static hexagonalPrismVolume(baseEdge, height) {
        (3 * Math.sqrt(3)) / 2 * baseEdge**2 * height
    }

    static dodecahedronVolume(edge) {
        (15 + 7 * Math.sqrt(5)) / 4 * (edge**3)
    }
}
